package geddon.com.dirgoolemaps.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import geddon.com.dirgoolemaps.R;
import geddon.com.dirgoolemaps.common.OKhttpManage;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class LocationActivity extends AppCompatActivity {


    @BindView(R.id.t1)
    TextView mT1;
    @BindView(R.id.t2)
    TextView mT2;
    @BindView(R.id.t3)
    TextView mT3;
    @BindView(R.id.t0)
    TextView mT0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_location);
        ButterKnife.bind(this);
        mT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJWD();
            }
        });

    }

    private void getJWD() {
        OKhttpManage.startPostgoogleMapsForjinweidu(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String s1 = response.body().string().trim();
                Log.e("经纬度返回值", s1);
                try {
                    JSONObject jsonObject = new JSONObject(s1);
                    if (jsonObject.has("location")) {
                        JSONObject location = jsonObject.getJSONObject("location");
                        final String lat = location.getString("lat");
                        final String lng = location.getString("lng");
                        mT0.post(new Runnable() {
                            @Override
                            public void run() {
                                mT0.setText("经纬度：lat=" + lat + ",lng=" + lng);
                            }
                        });
                        startdizhi(lat, lng);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public void startdizhi(String la, String lg) {
        OKhttpManage.startPostgoogleMapsFordizhi(la + "," + lg, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String s1 = response.body().string().trim();
                Log.e("地址返回值", s1);
                try {
                    JSONObject jsonObject = new JSONObject(s1);
                    JSONArray results = jsonObject.optJSONArray("results");
                    if (results != null && results.length() > 0) {
                        JSONObject jsonObject1 = results.getJSONObject(0);
                        final String formatted_address = jsonObject1.optString("formatted_address");
                        if (!TextUtils.isEmpty(formatted_address)) {
                            Log.e("显示地址", formatted_address);
                            mT0.post(new Runnable() {
                                @Override
                                public void run() {
                                    mT0.setText(mT0.getText().toString().trim() + "\t\n显示地址:" + formatted_address);
                                }
                            });

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
