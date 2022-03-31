package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  double total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void select(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.c1:
                if (checked) {
                    total += 100;
                } else {
                    total -= 100;
                }
                break;
            case R.id.c2:
                if (checked) {
                    total += 200;

                } else {
                    total -= 200;
                }
                break;
            case R.id.c3:
                if (checked) {
                    total += 300;
                } else {
                    total -= 300;
                }
                break;
        }

        Toast.makeText(this, "Total : " +total, Toast.LENGTH_SHORT).show();

    }
}