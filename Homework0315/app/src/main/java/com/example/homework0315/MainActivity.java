package com.example.homework0315;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    EditText et1, et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        tv = findViewById(R.id.textView);
    }

    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                tv.setText(et1.getText().toString() + et2.getText().toString());
                break;
            case R.id.btn2:
                tv.setText(String.valueOf(et1.getText().length()));
                break;
            case R.id.btn3:
                tv.setText(String.valueOf(et2.getText().length()));
                break;
        }
    }
}