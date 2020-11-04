package com.macvindev.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView stiAdVideoView = findViewById(R.id.stiAdVideoView);
        stiAdVideoView.setVideoPath("android.resource://" + getPackageName() + "/"+ R.raw.sti_ad);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(stiAdVideoView);

        stiAdVideoView.setMediaController(mediaController);
        stiAdVideoView.start();

    }
}