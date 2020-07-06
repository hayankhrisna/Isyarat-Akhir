package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.hayankhrisna.tugasakhir.R;

public class Materi2_Activity extends AppCompatActivity {

    private TextView materitvttitle;
    private VideoView videoMateri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);

        materitvttitle = findViewById(R.id.materitxttitle);
        videoMateri = findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoMateri);
        videoMateri.setMediaController(mediaController);
        videoMateri.start();

        //menerima data
        Intent intent2 = getIntent();
        String Title2 = intent2.getExtras().getString("Title");
        String Video2 = intent2.getExtras().getString("Video");

        //setting
        materitvttitle.setText(Title2);
        videoMateri.setVideoPath(Video2);
    }
}