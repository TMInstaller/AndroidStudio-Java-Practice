package com.example.app0322;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.GREEN);
        setContentView(baseLayout, params);

        EditText et = new EditText(this);
        et.setHint("여기서 글자 입력");
        baseLayout.addView(et);

        Button btn = new Button(this);
        btn.setText("나의 버튼");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        TextView tv = new TextView(this);
        tv.setHint("여기에 결과 출력");
        tv.setTextSize(20);
        baseLayout.addView(tv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "버튼 눌림", Toast.LENGTH_SHORT).show();
                tv.setText(et.getText().toString());
            }
        });

        CheckBox cb = new CheckBox(this);
        ImageView iv = new ImageView(this);
        baseLayout.addView(cb);
        baseLayout.addView(iv);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    iv.setImageResource(R.drawable.s);
                    iv.setVisibility(View.VISIBLE);
                } else {
                    iv.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}