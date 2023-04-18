package com.example.app0418;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        iv = findViewById(R.id.imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item1:
                iv.setImageResource(R.drawable.tino1);
                break;
            case R.id.item2:
                iv.setImageResource(R.drawable.tino2);
                break;
            case R.id.item3:
                iv.setImageResource(R.drawable.tino3);
                break;
            case R.id.item4:
                iv.setRotation(Float.parseFloat(et.getText().toString()));
                break;
            case R.id.item5:
                iv.setScaleX(2.0f);
                iv.setScaleY(2.0f);
                break;
        }
        return true;
    }
}