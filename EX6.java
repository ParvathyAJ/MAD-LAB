package com.example.toasttxtview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button clickButton =findViewById(R.id.mybtn);
TextView mytext=findViewById(R.id.text1);
clickButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
mytext.setText("................Hello my first button click.................");
}
});

}
}
