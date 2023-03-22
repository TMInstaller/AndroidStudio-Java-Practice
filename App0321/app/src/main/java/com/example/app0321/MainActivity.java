package com.example.app0321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv;
    Button btn1, btn2, btn3, btn4, btn5;
    String num1, num2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력 하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + result.toString());
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력 하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + result.toString());
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력 하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    tv.setText("계산 결과 : " + result.toString());
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력 하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        tv.setText("계산 결과 : " + result.toString());
                    }
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력 하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(), "0으로 나머지를 구할 수 없습니다.", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        tv.setText("계산 결과 : " + result.toString());
                    }
                }

            }
        });
    }
}