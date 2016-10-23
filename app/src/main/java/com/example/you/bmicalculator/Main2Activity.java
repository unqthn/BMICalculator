package com.example.you.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent j = getIntent();
        String que = j.getStringExtra("uuu");
        TextView x = (TextView)findViewById(R.id.textView2);
        x.setText(que);

        String que2 = j.getStringExtra("unq");
        TextView y = (TextView)findViewById(R.id.textView4);
        y.setText(que2);

    }
}
