package com.example.mynetwork;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.schedulers.IoScheduler;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkServiceGenerator {
    private static final String TAG = "NetworkServiceGenerator";
    private static String apiBaseUrl = "http://ec2-18-236-217-129.us-west-2.compute.amazonaws.com:8089/web/";
    //            "http://172.16.3.161:8089/web/";
    private static Retrofit.Builder builder = new Retrofit.Builder()            // static because one instance for entire app
            .baseUrl(apiBaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
    private static Retrofit retrofit = builder.build();
    private static HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY);
    private static OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();

    public interface NetworkServiceReturns {
        <T> void onNetworkResponse(NetworkRequestCode requestCode, T response);
    }

    private static NetworkServiceReturns networkServiceReturns;

    public static void setNetworkServiceReturns(Context context) {
        NetworkServiceGenerator.networkServiceReturns = (NetworkServiceReturns) context;
    }

    public static Retrofit retrofit() {
        return builder.build();
    }

    public static void changeApiBaseUrl(String newApiBaseUrl) {
        apiBaseUrl = newApiBaseUrl;

        builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(apiBaseUrl);
    }

    public static <S> S createNetworkClient(Class<S> networkClient) {
        if (!okHttpClientBuilder.interceptors().contains(loggingInterceptor) && BuildConfig.DEBUG) {
            okHttpClientBuilder.addInterceptor(new Interceptor() {
                @NonNull
                @Override
                public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
                    Request request = chain.request();
                    if(request.method().compareToIgnoreCase("post")==0){
                        Log.i(TAG,bodyToString(request));
                    }
                    okhttp3.Response response = chain.proceed(request);
                    String bodyString = "Empty";
                    if (response.body() != null) {
                        try {
                            bodyString = decode(response.body().string());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return response.newBuilder()
                            .body(ResponseBody.create((response.body().contentType()), bodyString))
                            .build();
                }
            });
            okHttpClientBuilder.addInterceptor(loggingInterceptor);
            builder = builder.client(okHttpClientBuilder.build());
            retrofit = builder.build();
        }
        return retrofit.create(networkClient);
    }

    public static <T> void callNetworkService(final NetworkRequestCode requestCode, Observable<T> observable) {
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(observable
                .subscribeOn(new IoScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<T>() {
                    @Override
                    public void accept(T t) throws Exception {
                        if (networkServiceReturns != null)
                            networkServiceReturns.onNetworkResponse(requestCode, t);
                        if (!compositeDisposable.isDisposed()) {
                            compositeDisposable.clear();
                            compositeDisposable.dispose();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (throwable instanceof HttpException) {
                            errorHandlingType1(((HttpException) throwable).response().code());
//                            errorHandlingType2(((HttpException) throwable).response());
//                            errorHandlingType3(((HttpException) throwable).response());
                        } else if (throwable instanceof IOException) {
                            Log.e(TAG, "No internet connection!");
                        } else {
                            Log.e(TAG, "Server returned error: unknown error ");
                        }
                        if (!compositeDisposable.isDisposed()) {
                            compositeDisposable.clear();
                            compositeDisposable.dispose();
                        }
                    }
                }));
    }

    public static void callNetworkService(List<Observable<?>> observables) {
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(
                Observable.zip(observables, new Function<Object[], Object[]>() {
                    @Override
                    public Object[] apply(Object[] objects) throws Exception {
                        return objects;
                    }
                }).subscribe(new Consumer<Object[]>() {
                    @Override
                    public void accept(Object[] o) throws Exception {
                        if (!compositeDisposable.isDisposed()) {
                            compositeDisposable.clear();
                            compositeDisposable.dispose();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (!compositeDisposable.isDisposed()) {
                            compositeDisposable.clear();
                            compositeDisposable.dispose();
                        }
                        if (throwable instanceof HttpException) {
                            errorHandlingType1(((HttpException) throwable).response().code());
//                            errorHandlingType2(((HttpException) throwable).response());
//                            errorHandlingType3(((HttpException) throwable).response());
                        } else if (throwable instanceof IOException) {
                            Log.e(TAG, "No internet connection!");
                        } else {
                            Log.e(TAG, "Server returned error: unknown error ");
                        }
                    }
                })
        );
    }

    private static void errorHandlingType1(int code) {
        switch (code) {
            case 404:
                Log.e(TAG, "Server returned error: user not found ");
                break;
            case 500:
                Log.e(TAG, "Server returned error: server is broken ");
                break;
            default:
                Log.e(TAG, "Server returned error: unknown error ");
                break;
        }
    }

    private static <T> void errorHandlingType2(Response<T> response) {
        try {
            Log.e(TAG, "Server returned error: " + (response.errorBody() != null ? response.errorBody().string() : ""));
        } catch (IOException e) {
            Log.e(TAG, "Server returned error: unknown error ");
            e.printStackTrace();
        }
    }

    /*private static <T> void errorHandlingType3(Response<T> response) {
        APIError error = ErrorUtils.parseError(response);
        Log.e(TAG, "Server returned error: " + error.message());
    }*/

    private static String bodyToString(final Request request) {
        try {
            final Request copy = request.newBuilder().build();
            final Buffer buffer = new Buffer();
            if (copy.body() != null)
                copy.body().writeTo(buffer);
            return decode(buffer.readUtf8());
        } catch (final IOException e) {
            return "did not work";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "did not work";
    }

    private static String decode(String string) throws Exception {
        return URLDecoder.decode(string, "UTF-8");
    }
}
