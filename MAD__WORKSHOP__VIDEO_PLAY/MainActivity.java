package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set MediaController to enable play,pause,forward,etc
        VideoView videoview=(VideoView) findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoview);
        //Location of the media file
        Uri uri = Uri.parse("android.resource://" +  getPackageName() + "/" + R.raw.scene);
        //Starting Video view By Setting MediaController and URI
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }}