package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent getintent=getIntent();
        String temp = null;
        temp=getintent.getStringExtra("selectBearScore");
        score=Integer.parseInt(temp);
        Button btn4=this.findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(score == 100){
                    Intent intent=new Intent(thirdActivity.this,fourthActivity.class);
                    intent.putExtra("selectBearScore",String.valueOf(score));
                    startActivity(intent);
                }
                else {
                    Intent intent=new Intent(thirdActivity.this,fifthActivity.class);
                    intent.putExtra("selectBearScore",String.valueOf(score));
                    startActivity(intent);
                }

            }
        });
        Typeface type = Typeface.createFromAsset(getAssets(),"font_one.TTF");
        btn4.setTypeface(type);
        TextView TextTemp2 = this.findViewById(R.id.tv_lion);
        TextTemp2.setTypeface(type);
        final ImageView imageKangaroo = this.findViewById(R.id.image_kangaroo);
        imageKangaroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageKangaroo.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.kangaroo_no));
            }
        });
        final ImageView imageLeo = this.findViewById(R.id.image_leo);
        imageLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageLeo.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.leo_no));
            }
        });
        final ImageView imageLion = this.findViewById(R.id.image_lion);
        imageLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageLion.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.lion_ok));
                score += 50;
            }
        });
        final ImageView imageElephant = this.findViewById(R.id.image_elephant);
        imageElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageElephant.setImageDrawable(getApplicationContext().getResources().getDrawable(R.drawable.elephant_no));
            }
        });
    }
}
