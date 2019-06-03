package com.example.mynetwork;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.example.mynetwork.dto.login.LoginDTO;
import com.vpdirect.essentials.Essentials;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        String randomNumber = Essentials.getRandomNumber(15);
        JSONObject formData = formData();

        Map<String, Object> map = new HashMap<>();
        map.put("rndValue", Essentials.getEncryptedString(randomNumber, getString(R.string.network_modulus_value), getString(R.string.network_public_exponent_value)));
        map.put("deviceId", "dg866V7EqY0:APA91bFG3JCZMveVMR5kaHQjM6PmoFAI7V_gLNpzytIyYku4nbU1XUQr1HY7AQzwF1kaVKe9U4qmGYMGzlc_bWNJIYdWZhNvmW_OSf6AsDDRtkyrwsdshf5LDvv3y6sHoLnvyBcrMCBs");
        map.put("csValue", Essentials.generateCheckSum(formData + randomNumber));
        map.put("formData", formData);

        Map<String, String> map1 = new HashMap<>();
        map1.put("role", "RETAIL_SUBSCRIBER");
        map1.put("channel", "SubscriberApp");
        map1.put("tenantCode", "vpdirect");
        map1.put("mdnId", "0897711103");
        map1.put("deviceId", "866460036868460");

        NetworkClient networkClient = NetworkServiceGenerator.createNetworkClient(NetworkClient.class);
        Observable<LoginDTO> loginDetails = networkClient.getLoginDetails(map);

        Observable<FetchSubscriberDTO> subscriberDetails = networkClient.getSubscriberDetails(map1);
        NetworkServiceGenerator.callNetworkService(NetworkRequestCode.REQUEST_CODE_POST, subscriberDetails);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.mipmap.ic_launcher_round);
        AppHelper.getFileDataFromDrawable(this,R.mipmap.ic_launcher_round);
        imageView.setImageURI(uri);
    }

    private JSONObject formData() {
        JSONObject jsonObject = new JSONObject();
        JSONObject deviceGeoInfo = new JSONObject();
        try {
            jsonObject.put("userName", "0897711103");
            jsonObject.put("mPin", Essentials.getEncryptedString("123456", getString(R.string.network_modulus_value), getString(R.string.network_public_exponent_value)));
            jsonObject.put("tenantCode", "vpdirect");
            jsonObject.put("role", "RETAIL_SUBSCRIBER");
            jsonObject.put("deviceId", "dg866V7EqY0:APA91bFG3JCZMveVMR5kaHQjM6PmoFAI7V_gLNpzytIyYku4nbU1XUQr1HY7AQzwF1kaVKe9U4qmGYMGzlc_bWNJIYdWZhNvmW_OSf6AsDDRtkyrwsdshf5LDvv3y6sHoLnvyBcrMCBs");
            jsonObject.put("mobileNumber", "0897711103");

            deviceGeoInfo.put("ipaddress", "172.16.2.41");
            deviceGeoInfo.put("deviceId", "fdc207f7c13c584d");
            deviceGeoInfo.put("simId", "404490298049474");
            deviceGeoInfo.put("imieNumber", "866460036868460");
            deviceGeoInfo.put("latitude", "");
            deviceGeoInfo.put("longitude", "");
            deviceGeoInfo.put("appversion", "1.7");
            deviceGeoInfo.put("appType", "CustomerAndroid");
            deviceGeoInfo.put("deviceManufacturer", "Xiaomi Redmi 4");

            jsonObject.put("deviceGeoInfo", deviceGeoInfo);

            return jsonObject;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String decode(String string) throws Exception {
        return URLDecoder.decode(string, "UTF-8");
    }
}
