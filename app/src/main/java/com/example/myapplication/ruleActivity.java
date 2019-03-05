package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ruleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        Button btn7=this.findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ruleActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Typeface type = Typeface.createFromAsset(getAssets(),"font_one.TTF");
        btn7.setTypeface(type);
        TextView Text1 = this.findViewById(R.id.tv_1);
        TextView Text2 = this.findViewById(R.id.tv_2);
        TextView Text3 = this.findViewById(R.id.tv_3);
        TextView Text4 = this.findViewById(R.id.tv_4);
        TextView Text5 = this.findViewById(R.id.tv_5);
        TextView Text6 = this.findViewById(R.id.tv_6);
        TextView Text7 = this.findViewById(R.id.tv_7);
        Text1.setTypeface(type);
        Text2.setTypeface(type);
        Text3.setTypeface(type);
        Text4.setTypeface(type);
        Text5.setTypeface(type);
        Text6.setTypeface(type);
        Text7.setTypeface(type);

    }
}
