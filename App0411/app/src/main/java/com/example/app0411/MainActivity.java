package com.example.app0411;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private AFragment fragmentA;
    private BFragment fragmentB;
    private FragmentTransaction transaction;

    private Bundle dataFromFrag; // 전역변수 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new AFragment();
        fragmentB = new BFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
    }

    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.btn_fragmentA:
                transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                break;
            case R.id.btn_fragmentB:
                fragmentB.setArguments(dataFromFrag);
                transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                break;
        }
    }

    public void receiveDataFromFragment(Bundle data){
        dataFromFrag = data;
    }
}
