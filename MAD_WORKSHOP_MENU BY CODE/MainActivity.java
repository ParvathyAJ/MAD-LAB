package com.example.menucode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnshow);
        registerForContextMenu(btn);
    }
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu. setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),0,"Search");
        menu.add(0,v.getId(),0,"Copy");
        menu.add(0,v.getId(),0,"Share");
        menu.add(0,v.getId(),0,"Bookmark");
        menu.add(0,v.getId(),0,"Print");
    }
}