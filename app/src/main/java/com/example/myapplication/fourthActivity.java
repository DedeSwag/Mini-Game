package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fourthActivity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        Intent getintent=getIntent();
        String temp = null;
        temp=getintent.getStringExtra("selectBearScore");
        score=Integer.parseInt(temp);
        Button btn5=this.findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fourthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Typeface type = Typeface.createFromAsset(getAssets(),"font_one.TTF");
        btn5.setTypeface(type);
        TextView TextTemp3 = this.findViewById(R.id.tv_great);
        TextTemp3.setTypeface(type);
        TextView TextTemp4 = this.findViewById(R.id.textView1);
        TextTemp4.setTypeface(type);
        TextView TextTemp5 = this.findViewById(R.id.tv_score);
        TextTemp5.setText(String.valueOf(score));
    }
}
