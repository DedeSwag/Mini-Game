package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn3=this.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(secondActivity.this,thirdActivity.class);
                intent.putExtra("selectBearScore",String.valueOf(score));
                startActivity(intent);
            }
        });
        Typeface type = Typeface.createFromAsset(getAssets(),"font_one.TTF");
        btn3.setTypeface(type);
        TextView TextTemp1 = this.findViewById(R.id.tv_flower);
        TextTemp1.setTypeface(type);
        final ImageView imageBee = this.findViewById(R.id.Image_bee);
        imageBee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageBee.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.honey_no));
                score = 0;
            }
        });
        final ImageView imageFlower = this.findViewById(R.id.Image_flower);
        imageFlower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageFlower.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.flower_ok));
                score = 50;
            }
        });
        final ImageView imageSun = this.findViewById(R.id.Image_sun);
        imageSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageSun.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.sun_no));
                score = 0;
            }
        });
        final ImageView imageHouse = this.findViewById(R.id.Image_house);
        imageHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageHouse.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.house_no));
                score = 0;
            }
        });
    }
}
