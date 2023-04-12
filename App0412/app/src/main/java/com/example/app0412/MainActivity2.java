package com.example.app0412;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity implements  ListFragment.ImageSelectionCallback{

    ListFragment listFragment;
    ViewerFragment viewerFragment;
    int images[] = {R.drawable.q10, R.drawable.marshmallow, R.drawable.q};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager manager = getSupportFragmentManager();
        listFragment = (ListFragment)manager.findFragmentById(R.id.listFragment);
        viewerFragment = (ViewerFragment)manager.findFragmentById(R.id.viwerFragment);
    }

    @Override
    public void onImageSelected(int position) {
        viewerFragment.setImage(images[position]);
    }
}
