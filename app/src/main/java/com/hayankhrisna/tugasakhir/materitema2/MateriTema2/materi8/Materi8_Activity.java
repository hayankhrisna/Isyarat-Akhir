package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi8;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.hayankhrisna.tugasakhir.R;

public class Materi8_Activity extends AppCompatActivity {

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
//        videoMateri.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +
//                R.raw.olahraga));
        videoMateri.start();

        //menerima data
        Intent intent1 = getIntent();
        String Title7 = intent1.getExtras().getString("Title");
        String Video7 = intent1.getExtras().getString("Video");

        //setting
        materitvttitle.setText(Title7);
        videoMateri.setVideoPath(Video7);
    }
}