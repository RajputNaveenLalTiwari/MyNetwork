package com.example.mynetwork;

import com.example.mynetwork.dto.login.LoginDTO;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface NetworkClient {
    @FormUrlEncoded
    @POST("doMobileLogin.do")
    Observable<LoginDTO> getLoginDetails(@FieldMap(encoded = false) Map<String, Object> map);

    @FormUrlEncoded
    @POST("fetchSubscriberByMDN.act")
    Observable<FetchSubscriberDTO> getSubscriberDetails(@FieldMap(encoded = true) Map<String, String> map);
}
