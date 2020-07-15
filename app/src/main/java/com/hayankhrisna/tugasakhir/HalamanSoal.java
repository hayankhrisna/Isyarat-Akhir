package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hayankhrisna.tugasakhir.LatihanSoal.SoalTema1;

public class HalamanSoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_soal);
        Intent intent = getIntent();
    }


    public void btnMulai(View view) {
        Intent intent = new Intent(HalamanSoal.this, SoalTema1.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(HalamanSoal.this, MainActivity.class);
        intent.addCategory(Intent.CATEGORY_HOME);

        startActivity(intent);
        super.onBackPressed();
    }


}

