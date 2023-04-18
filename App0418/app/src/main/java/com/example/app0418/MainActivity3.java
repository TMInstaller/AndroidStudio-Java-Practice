package com.example.app0418;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast tm = Toast.makeText(getApplicationContext(), "토스트 연습", Toast.LENGTH_SHORT);
                Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int offx = (int) (Math.random() * display.getWidth());
                int offy = (int) (Math.random() * display.getHeight());
                tm.setGravity(Gravity.TOP | Gravity.LEFT, offx, offy);
                tm.show();
            }
        });
    }
}