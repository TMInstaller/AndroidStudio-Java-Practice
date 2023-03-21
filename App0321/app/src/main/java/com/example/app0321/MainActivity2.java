package com.example.app0321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {

    CheckBox cb1, cb2, cb3;
    ImageView iv1, iv2, iv3;
    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        iv1 = (ImageView) findViewById(R.id.imageView1);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv3 = (ImageView) findViewById(R.id.imageView3);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    cb1.setVisibility(View.VISIBLE);
                    cb2.setVisibility(View.VISIBLE);
                    cb3.setVisibility(View.VISIBLE);
                } else {
                    cb1.setVisibility(View.INVISIBLE);
                    cb2.setVisibility(View.INVISIBLE);
                    cb3.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    iv1.setVisibility(View.VISIBLE);
                } else {
                    iv1.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    iv2.setVisibility(View.VISIBLE);
                } else {
                    iv2.setVisibility(View.INVISIBLE);
                }
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    iv3.setVisibility(View.VISIBLE);
                } else {
                    iv3.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}