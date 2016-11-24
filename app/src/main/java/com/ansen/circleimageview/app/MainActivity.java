package com.ansen.circleimageview.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ansen.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleImageView ciImage2= (CircleImageView) findViewById(R.id.ci_image2);
        ciImage2.setBorder(getResources().getColor(android.R.color.holo_red_dark),2);//设置边框
    }
}
