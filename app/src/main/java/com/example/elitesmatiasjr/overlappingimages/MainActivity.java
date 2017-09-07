package com.example.elitesmatiasjr.overlappingimages;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_Change;
    ImageView iv_image1;
    ImageView iv_image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Change = (Button) findViewById(R.id.btnChange);
        iv_image1 = (ImageView) findViewById(R.id.ivImage1);
        iv_image2 = (ImageView) findViewById(R.id.ivImage2);

        btn_Change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (iv_image1.getVisibility()==View.VISIBLE) {
                    iv_image1.setVisibility(View.GONE);
                    iv_image2.setVisibility(View.VISIBLE);
                } else {
                    iv_image1.setVisibility(View.VISIBLE);
                    iv_image2.setVisibility(View.GONE);
                }
            }
        });
    }
}
