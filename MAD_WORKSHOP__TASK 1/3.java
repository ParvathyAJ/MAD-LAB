package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        VideoView v=(VideoView) findViewById(R.id.v);
        MediaController m=new MediaController(this);
        m.setAnchorView(v);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.butter);
        v.setMediaController(m);
        v.setVideoURI(uri);
        v.requestFocus();
        v.start();

        Button b3=(Button) findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(i);


            }
        });
    }
}