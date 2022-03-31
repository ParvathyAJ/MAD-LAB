package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t = findViewById(R.id.t);

    }

    public void toggle(View view) {
        if (t.isChecked()) {
            Toast.makeText(this, "Switched on", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Switched off", Toast.LENGTH_SHORT).show();
        }
    }
}
