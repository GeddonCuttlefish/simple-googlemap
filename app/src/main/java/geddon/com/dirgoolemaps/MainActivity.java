package geddon.com.dirgoolemaps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import geddon.com.dirgoolemaps.act.LocationActivity;
import geddon.com.dirgoolemaps.act.MapsActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.t1)
    TextView mT1;

    @BindView(R.id.t2)
    TextView mT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MapsActivity.class));
            }
        });
        mT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), LocationActivity.class));
            }
        });
    }
}
