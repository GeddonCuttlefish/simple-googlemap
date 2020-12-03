package geddon.com.dirgoolemaps.act;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;

import java.io.IOException;
import java.util.List;

import geddon.com.dirgoolemaps.R;
import geddon.com.dirgoolemaps.bean.GooglemapBean;
import geddon.com.dirgoolemaps.common.OKhttpManage;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnPolylineClickListener, GoogleMap.OnPolygonClickListener {

    private GoogleMap mMap;
    public static String start = "北京";
    public static String end = "天津";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(9);
        mMap.setMaxZoomPreference(19);
        googleMap.setOnPolylineClickListener(this);
        googleMap.setOnPolygonClickListener(this);

        String url = "https://maps.googleapis.com/maps/api/directions/json?origin=" + start + "&destination=" + end + "&language=zh-TW&key=AIzaSyCCLveyOKDiXEX8ukMAsZkfpGrrcnkOJKY";
        Log.e("map", url);
        OKhttpManage.startMap(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String s1 = response.body().string().trim();
                Log.e("onResponse:map", s1);
                try {
                    //路径规划
                    GooglemapBean googlemapBean = JSON.parseObject(s1, GooglemapBean.class);
                    List<LatLng> latLngs = PolyUtil.decode(googlemapBean.getRoutes().get(0).getOverview_polyline().getPoints());
                    final PolylineOptions polyline = new PolylineOptions().addAll(latLngs).color(Color.GREEN).width(15f);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mMap.addPolyline(polyline);
                        }
                    });


                    //地图移动至经纬度
                    double lat = googlemapBean.getRoutes().get(0).getBounds().getSouthwest().getLat();
                    double lng = googlemapBean.getRoutes().get(0).getBounds().getSouthwest().getLng();
                    final LatLng sydney = new LatLng(lat, lng);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });

    }

    Handler mHandler = new Handler();

    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onPolygonClick(Polygon polygon) {

    }
}
