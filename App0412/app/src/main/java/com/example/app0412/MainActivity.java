package com.example.app0412;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    FragmentManager manager;
    FragmentTransaction transaction;
    AFragment aFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // manager = getSupportFragmentManager();
        // aFragment = new AFragment();
        // transaction.add(R.id.lineaLayout, aFragment);

    }
    public void replaceFragment(Fragment fragment) {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.lineaLayout, fragment).commit();}


}
