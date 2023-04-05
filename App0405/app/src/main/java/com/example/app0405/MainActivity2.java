package com.example.app0405;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity2 extends AppCompatActivity {

    SeekBar seekBar;
    ImageView iv1, iv2, iv3, iv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iv1 = (ImageView) findViewById(R.id.imageView1);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv3 = (ImageView) findViewById(R.id.imageView3);
        iv4 = (ImageView) findViewById(R.id.imageView4);
        seekBar = (SeekBar) findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i >= 0 && i < 25) {
                    iv1.setVisibility(View.VISIBLE);
                    iv2.setVisibility(View.INVISIBLE);
                    iv3.setVisibility(View.INVISIBLE);
                    iv4.setVisibility(View.INVISIBLE);
                } else if (i >= 25 & i < 50) {
                    iv1.setVisibility(View.INVISIBLE);
                    iv2.setVisibility(View.VISIBLE);
                    iv3.setVisibility(View.INVISIBLE);
                    iv4.setVisibility(View.INVISIBLE);
                } else if (i >= 50 & i < 75) {
                    iv1.setVisibility(View.INVISIBLE);
                    iv2.setVisibility(View.INVISIBLE);
                    iv3.setVisibility(View.VISIBLE);
                    iv4.setVisibility(View.INVISIBLE);
                } else {
                    iv1.setVisibility(View.INVISIBLE);
                    iv2.setVisibility(View.INVISIBLE);
                    iv3.setVisibility(View.INVISIBLE);
                    iv4.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}