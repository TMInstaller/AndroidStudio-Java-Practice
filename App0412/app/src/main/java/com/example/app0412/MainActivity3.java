package com.example.app0412;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity implements FirstFragment.TextSender{
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        firstFragment = (FirstFragment)getSupportFragmentManager().findFragmentById(R.id.firstFragment);
        secondFragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.secondFragment);

    }

    @Override
    public void send(String text) {
        secondFragment.changeText(text);
    }
}
