package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HalamanMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_materi);
        Intent intent = getIntent();
    }

    public void launchMateri1(View view) {
        Intent intent = new Intent(HalamanMateri.this, MateriTema1.class);
        startActivity(intent);
    }

    public void launchMateri2(View view) {
        Intent intent = new Intent(HalamanMateri.this, MateriTema2.class);
        startActivity(intent);
    }
}
