package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fifthActivity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Intent getintent=getIntent();
        String temp = null;
        temp=getintent.getStringExtra("selectBearScore");
        score=Integer.parseInt(temp);
        Button btn6=this.findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(fifthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Typeface type = Typeface.createFromAsset(getAssets(),"font_one.TTF");
        btn6.setTypeface(type);
        TextView TextTemp6 = this.findViewById(R.id.tv_failed);
        TextTemp6.setTypeface(type);
        TextView TextTemp7 = this.findViewById(R.id.textView2);
        TextTemp7.setTypeface(type);
        TextView TextTemp8 = this.findViewById(R.id.tv_score2);
        TextTemp8.setText(String.valueOf(score));
    }
}
