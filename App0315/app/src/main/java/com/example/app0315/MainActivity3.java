package com.example.app0315;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et = findViewById(R.id.editText2);
        tv = findViewById(R.id.textView3);
    }

    public void mOnClick(View v){
        switch (v.getId()){
            case R.id.button7:
                tv.setText(et.getText().toString() + "버튼 7 눌러짐");
            break;
            case R.id.button8:
                tv.setText(et.getText().toString() + "버튼 8 눌러짐");
            break;
            case R.id.button9:
                tv.setText(et.getText().toString() + "버튼 9 눌러짐");
            break;

        }
    }
}