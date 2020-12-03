package geddon.com.dirgoolemaps.common;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by Geddon on 2019/7/31.
 */
public class OKhttpManage {
    public static String MAPKEY = "AIzaSyCCLveyOKDiXEX8ukMAsZkfpGrrcnkOJKY";

    public static void startPostgoogleMapsForjinweidu(Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        String url = "https://www.googleapis.com/geolocation/v1/geolocate?&key=AIzaSyCCLveyOKDiXEX8ukMAsZkfpGrrcnkOJKY";
        FormBody.Builder builder = new FormBody.Builder();
        RequestBody requestBody = builder.build();
        Request request = new Request.Builder().url(url).post(requestBody).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    public static void startPostgoogleMapsFordizhi(String latlng, Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        String url = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + latlng + "&language=zh-TW&key=AIzaSyCCLveyOKDiXEX8ukMAsZkfpGrrcnkOJKY";
        FormBody.Builder builder = new FormBody.Builder();
        RequestBody requestBody = builder.build();
        Request request = new Request.Builder().url(url).post(requestBody).build();
        okHttpClient.newCall(request).enqueue(callback);
    }


    public static void startMap(String url, final Callback backCall) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url(url).get().build();
        okHttpClient.newCall(request).enqueue(backCall);
    }

}
