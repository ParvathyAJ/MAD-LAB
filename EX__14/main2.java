package com.example.ex_14;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras=getIntent().getExtras();
        String v1=extras.getString("value1");
        t=(TextView) findViewById(R.id.textView2);
        t.setText(t.getText()+" "+v1);
    }
}