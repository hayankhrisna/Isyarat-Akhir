package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi1.Main1Activity;
import com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi2.Main2Activity;
import com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi3.Main3Activity;
import com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi4.Main4Activity;

public class MateriTema1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_tema1);
        Intent intent = getIntent();
    }

    public void launchTeman(View view) {
        Intent intent = new Intent(MateriTema1.this, Main1Activity.class);
        startActivity(intent);
    }

    public void launchTubuhku(View view) {
        Intent intent = new Intent(MateriTema1.this, Main2Activity.class);
        startActivity(intent);
    }

    public void launchMerawatTubuh(View view) {
        Intent intent = new Intent(MateriTema1.this, Main3Activity.class);
        startActivity(intent);
    }

    public void launchIstimewa(View view) {
        Intent intent = new Intent(MateriTema1.this, Main4Activity.class);
        startActivity(intent);
    }
}
