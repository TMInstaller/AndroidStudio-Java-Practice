package com.example.app0419;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileOutputStream fos = openFileOutput("file.txt", Context.MODE_PRIVATE);
                    String str = "모바일서비스디자인 수업시간입니다";
                    fos.write(str.getBytes());
                    fos.close();
                    Toast.makeText(getApplicationContext(), "file.txt가 생성됨", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream fis = openFileInput("file.txt");
                    byte[] txt = new byte[30];
                    fis.read(txt);
                    TextView tv = (TextView) findViewById(R.id.textView);
                    tv.setText(new String(txt));
                    fis.close();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "file.txt가 존재하지 않음", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}