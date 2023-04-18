package com.example.app0418;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    Button btn2, btn3;
    LinearLayout baseLayout;
    int size = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = findViewById(R.id.button2);
        registerForContextMenu(btn2);
        btn3 = findViewById(R.id.button3);
        registerForContextMenu(btn3);
        baseLayout = findViewById(R.id.baseLayout);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        if(v == btn2){
            menu.setHeaderTitle("배경색 변경");
            inflater.inflate(R.menu.menu2, menu);
        } else if (v == btn3){
            menu.setHeaderTitle("글자 크기 변경");
            inflater.inflate(R.menu.menu3, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()){
            case R.id.item6:
                baseLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.item7:
                baseLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.item8:
                baseLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.item9:
                size -= 5;
                btn3.setTextSize(size);
                break;
            case R.id.item10:
                size += 5;
                btn3.setTextSize(size);
                break;
        }
        return true;
    }
}