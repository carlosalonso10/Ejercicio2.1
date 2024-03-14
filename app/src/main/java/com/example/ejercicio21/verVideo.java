package com.example.ejercicio21;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class verVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_video);

        String videoUrl = getIntent().getStringExtra("video_url");

        // Encuentra el VideoView en tu diseño XML
        VideoView videoView = findViewById(R.id.videoView3);

        // Configura un MediaController para permitir el control de reproducción
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Configura la URL del video en el VideoView y comienza la reproducción
        videoView.setVideoURI(Uri.parse(videoUrl));
        videoView.start();
    }
}