package com.example.exericse12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_first;
    Intent my_intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_first=(Button)findViewById(R.id.bt_next);
        bt_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_intent=new Intent(MainActivity.this,SecondActivity.class);
                my_intent.putExtra("value1","Hello!!!");
                startActivity(my_intent);
            }
        });

    }
}




