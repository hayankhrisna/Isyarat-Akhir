package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;
import java.util.ArrayList;
import java.util.List;

public class Materi5Activity extends AppCompatActivity {

    List<Tema2Materi1> listMateri5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri5 = new ArrayList<>();
        listMateri5.add(new Tema2Materi1("Olahraga", "android.resource://" + getPackageName() + "/" + R.raw.olahraga, R.drawable.olahraga));
        listMateri5.add(new Tema2Materi1("Sehat", "android.resource://" + getPackageName() + "/" + R.raw.sehat, R.drawable.sehat));
        listMateri5.add(new Tema2Materi1("Lelah", "android.resource://" + getPackageName() + "/" + R.raw.lelah, R.drawable.lelah));
//        listMateri5.add(new Tema2Materi1("Tubuh", "android.resource://" + getPackageName() + "/" + R.raw.tubuh, R.drawable.tubuh));
        listMateri5.add(new Tema2Materi1("Senam", "android.resource://" + getPackageName() + "/" + R.raw.senam, R.drawable.senam));
        listMateri5.add(new Tema2Materi1("Bermain", "android.resource://" + getPackageName() + "/" + R.raw.bermain, R.drawable.bermain));
        listMateri5.add(new Tema2Materi1("Berlari", "android.resource://" + getPackageName() + "/" + R.raw.berlari, R.drawable.berlari));
        listMateri5.add(new Tema2Materi1("Berenang", "android.resource://" + getPackageName() + "/" + R.raw.berenang, R.drawable.berenang));
        listMateri5.add(new Tema2Materi1("Melompat", "android.resource://" + getPackageName() + "/" + R.raw.melompat, R.drawable.melompat));
        listMateri5.add(new Tema2Materi1("Sepak Bola", "android.resource://" + getPackageName() + "/" + R.raw.sepakbola, R.drawable.sepakbola));
        listMateri5.add(new Tema2Materi1("Badminton", "android.resource://" + getPackageName() + "/" + R.raw.badminton, R.drawable.badminton));
        listMateri5.add(new Tema2Materi1("Gawang", "android.resource://" + getPackageName() + "/" + R.raw.gawang, R.drawable.gawang));
        listMateri5.add(new Tema2Materi1("Lapangan", "android.resource://" + getPackageName() + "/" + R.raw.lapangan, R.drawable.lapangan));
        listMateri5.add(new Tema2Materi1("Kolam Renang", "android.resource://" + getPackageName() + "/" + R.raw.kolamrenang, R.drawable.kolamrenang));
        listMateri5.add(new Tema2Materi1("Bola", "android.resource://" + getPackageName() + "/" + R.raw.bola, R.drawable.bola));
        listMateri5.add(new Tema2Materi1("Sepatu", "android.resource://" + getPackageName() + "/" + R.raw.sepatu, R.drawable.sepatu));

        RecyclerView myrv5 = findViewById(R.id.recyclerviewmateri_id);
        Recycler5 myAdapter5 = new Recycler5(this,listMateri5);
        myrv5.setLayoutManager(new GridLayoutManager(this,2));
        myrv5.setAdapter(myAdapter5);
    }
}
