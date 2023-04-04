package com.example.app0322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TableCalculator extends AppCompatActivity {

    EditText et1, et2;
    Button btn1, btn2, btn3, btn4;
    TextView tv;
    String num1, num2;
    Integer result;
    Button[] numBtn = new Button[10];
    Integer[] numBtnId = {R.id.b_0, R.id.b_1, R.id.b_2,
            R.id.b_3, R.id.b_4, R.id.b_5, R.id.b_6,
            R.id.b_7, R.id.b_8, R.id.b_9};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_calculator);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        btn1 = (Button) findViewById(R.id.b_plus);
        btn2 = (Button) findViewById(R.id.b_minus);
        btn3 = (Button) findViewById(R.id.b_times);
        btn4 = (Button) findViewById(R.id.b_divide);
        tv = (TextView) findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = et1.getText().toString();
                num2 = et2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                tv.setText("계산결과: "+result);
            }
        });
        for(i=0; i<numBtnId.length; i++){
            numBtn[i] = (Button) findViewById(numBtnId[i]);     //숫자버튼 위젯 가져오기
        }
        for(i=0; i<numBtnId.length; i++) {
            final int index;
            index = i;
            numBtn[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(et1.isFocused()){
                        num1 = et1.getText().toString() + numBtn[index].getText().toString();
                        et1.setText(num1);
                    }else if(et2.isFocused()){
                        num2 = et2.getText().toString() + numBtn[index].getText().toString();
                        et2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(), "입력할 곳을 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}