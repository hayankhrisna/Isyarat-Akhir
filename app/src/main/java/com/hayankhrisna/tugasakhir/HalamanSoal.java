package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hayankhrisna.tugasakhir.LatihanSoal.SoalTema1;
import com.hayankhrisna.tugasakhir.LatihanSoal.SoalTema2;

public class HalamanSoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_soal);
        Intent intent = getIntent();
    }

    public void launchSoal1(View view) {
        Intent intent = new Intent(HalamanSoal.this, SoalTema1.class);
        startActivity(intent);
    }

    public void launchSoal2(View view) {
        Intent intent = new Intent(HalamanSoal.this, SoalTema2.class);
        startActivity(intent);
    }
}
