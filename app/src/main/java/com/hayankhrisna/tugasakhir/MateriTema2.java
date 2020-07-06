package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi5.Materi5Activity;
import com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi6.Materi6Activity;
import com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi7.Main7Activity;
import com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi8.Materi8Activity;


public class MateriTema2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_tema2);
        Intent intent = getIntent();
    }

    public void launchOlahraga(View view) {
        Intent intent = new Intent(MateriTema2.this, Materi5Activity.class);
        startActivity(intent);
    }

    public void launchNari(View view) {
        Intent intent = new Intent(MateriTema2.this, Materi6Activity.class);
        startActivity(intent);
    }

    public void launchNggambar(View view) {
        Intent intent = new Intent(MateriTema2.this, Main7Activity.class);
        startActivity(intent);
    }

    public void launchBaca(View view) {
        Intent intent = new Intent(MateriTema2.this, Materi8Activity.class);
        startActivity(intent);
    }


}
