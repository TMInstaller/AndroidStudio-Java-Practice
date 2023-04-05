package com.example.app0405;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity5 extends AppCompatActivity {

    Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final ViewFlipper viewFlipper;
        btnPrev = (Button) findViewById(R.id.button51);
        btnNext = (Button) findViewById(R.id.button52);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                viewFlipper.showPrevious();
                viewFlipper.startFlipping();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                viewFlipper.showNext();
                viewFlipper.stopFlipping();
            }
        });
    }
}