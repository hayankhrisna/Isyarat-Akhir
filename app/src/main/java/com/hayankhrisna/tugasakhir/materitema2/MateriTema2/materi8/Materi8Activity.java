package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi8;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class Materi8Activity extends AppCompatActivity {

    List<Tema2Materi4> listMateri8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri8 = new ArrayList<>();
        listMateri8.add(new Tema2Materi4("Membaca", "android.resource://" + getPackageName() + "/" + R.raw.membaca, R.drawable.membaca));
        listMateri8.add(new Tema2Materi4("Belajar", "android.resource://" + getPackageName() + "/" + R.raw.belajar, R.drawable.belajar));
        listMateri8.add(new Tema2Materi4("Menulis", "android.resource://" + getPackageName() + "/" + R.raw.tulis, R.drawable.menulis));
        listMateri8.add(new Tema2Materi4("Buku", "android.resource://" + getPackageName() + "/" + R.raw.buku, R.drawable.buku));
        listMateri8.add(new Tema2Materi4("Buku Cerita", "android.resource://" + getPackageName() + "/" + R.raw.bukucerita, R.drawable.bukucerita));
        listMateri8.add(new Tema2Materi4("Buku Pelajaran", "android.resource://" + getPackageName() + "/" + R.raw.bukupelajaran, R.drawable.bukupelajaran));
        listMateri8.add(new Tema2Materi4("Koran", "android.resource://" + getPackageName() + "/" + R.raw.koran, R.drawable.koran));
        listMateri8.add(new Tema2Materi4("Majalah", "android.resource://" + getPackageName() + "/" + R.raw.majalah, R.drawable.majalah));
//        listMateri8.add(new Tema2Materi4("Cerita", "android.resource://" + getPackageName() + "/" + R.raw.cerita, R.drawable.cerita));
        listMateri8.add(new Tema2Materi4("Puisi", "android.resource://" + getPackageName() + "/" + R.raw.puisi, R.drawable.puisi));
        listMateri8.add(new Tema2Materi4("Pandai", "android.resource://" + getPackageName() + "/" + R.raw.pandai, R.drawable.pandai));
        listMateri8.add(new Tema2Materi4("Rapi", "android.resource://" + getPackageName() + "/" + R.raw.rapi, R.drawable.rapi));
//        listMateri8.add(new Tema2Materi4("Pinjam", "android.resource://" + getPackageName() + "/" + R.raw.pinjam, R.drawable.pinjam));
//        listMateri8.add(new Tema2Materi4("Catat", "android.resource://" + getPackageName() + "/" + R.raw.catat, R.drawable.catat));


        RecyclerView myrv8 = findViewById(R.id.recyclerviewmateri_id);
        Recycler8 myAdapter8 = new Recycler8(this,listMateri8);
        myrv8.setLayoutManager(new GridLayoutManager(this,2));
        myrv8.setAdapter(myAdapter8);
    }
}