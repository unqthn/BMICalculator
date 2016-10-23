package com.example.you.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private InputDigits mInputDigits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button you = (Button) findViewById(R.id.button);
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("uuu", "19.53");
                Human U = new Human();
                i.putExtra("unq", U.BMIHuman());

                startActivity(i);
            }
        });


    }




    private void addDigit(int i) {
        if (mInputDigits.get().length() < 6) { //get ค่าจากตัวโมเดล
            mInputDigits.add(i);
            showDigits();
        }
    }



    private void showDigits() {
        TextView tv = (TextView) findViewById(R.id.height);
        tv.setText(mInputDigits.get());

    }
   // AlertDialog.Builder dialog = new AlertDialog().Builder(context);
}
