package com.example.app0321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {
    RadioButton rb1, rb2, rb3;
    ImageView iv1, iv2, iv3;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        iv1 = (ImageView) findViewById(R.id.imageView4);
        iv2 = (ImageView) findViewById(R.id.imageView5);
        iv3 = (ImageView) findViewById(R.id.imageView6);
        rg = (RadioGroup) findViewById(R.id.radioGroup2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton1:
                        iv1.setVisibility(View.VISIBLE);
                        iv2.setVisibility(View.INVISIBLE);
                        iv3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioButton2:
                        iv1.setVisibility(View.INVISIBLE);
                        iv2.setVisibility(View.VISIBLE);
                        iv3.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.radioButton3:
                        iv1.setVisibility(View.INVISIBLE);
                        iv2.setVisibility(View.INVISIBLE);
                        iv3.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
//        rb1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                c
//            }
//        });
//        rb2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                iv1.setVisibility(View.INVISIBLE);
//                iv2.setVisibility(View.VISIBLE);
//                iv3.setVisibility(View.INVISIBLE);
//            }
//        });
//        rb3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                iv1.setVisibility(View.INVISIBLE);
//                iv2.setVisibility(View.INVISIBLE);
//                iv3.setVisibility(View.VISIBLE);
//            }
//        });
    }
}