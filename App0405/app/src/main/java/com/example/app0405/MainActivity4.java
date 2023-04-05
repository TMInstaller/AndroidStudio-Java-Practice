package com.example.app0405;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SlidingDrawer;

public class MainActivity4 extends AppCompatActivity {

    SlidingDrawer drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn = findViewById(R.id.btnclose);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer = findViewById(R.id.slide1);
                drawer.animateClose();
            }
        });
    }
}
