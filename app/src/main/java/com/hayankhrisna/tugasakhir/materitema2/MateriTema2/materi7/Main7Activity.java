package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi7;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class Main7Activity extends AppCompatActivity {

    List<Tema2Materi3> listMateri7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri7 = new ArrayList<>();
        listMateri7.add(new Tema2Materi3("Pelukis", "android.resource://" + getPackageName() + "/" + R.raw.pelukis, R.drawable.pelukis));
        listMateri7.add(new Tema2Materi3("Penjahit", "android.resource://" + getPackageName() + "/" + R.raw.penjahit, R.drawable.penjahit));
        listMateri7.add(new Tema2Materi3("Menggambar", "android.resource://" + getPackageName() + "/" + R.raw.menggambar, R.drawable.menggambar));
        listMateri7.add(new Tema2Materi3("Cat", "android.resource://" + getPackageName() + "/" + R.raw.cat, R.drawable.cat));
        listMateri7.add(new Tema2Materi3("Pensil", "android.resource://" + getPackageName() + "/" + R.raw.pensil, R.drawable.pensil));
        listMateri7.add(new Tema2Materi3("Buku Gambar", "android.resource://" + getPackageName() + "/" + R.raw.bukugambar, R.drawable.bukgambar));
        listMateri7.add(new Tema2Materi3("Penggaris", "android.resource://" + getPackageName() + "/" + R.raw.penggaris, R.drawable.penggaris));
        listMateri7.add(new Tema2Materi3("Penghapus", "android.resource://" + getPackageName() + "/" + R.raw.pengapus, R.drawable.penghapus));
        listMateri7.add(new Tema2Materi3("Warna", "android.resource://" + getPackageName() + "/" + R.raw.warna, R.drawable.warna));
        listMateri7.add(new Tema2Materi3("Seni", "android.resource://" + getPackageName() + "/" + R.raw.seni, R.drawable.seni));
//        listMateri7.add(new Tema2Materi3("Merah", "android.resource://" + getPackageName() + "/" + R.raw.merah, R.drawable.merah));
//        listMateri7.add(new Tema2Materi3("Kuning", "android.resource://" + getPackageName() + "/" + R.raw.kuning, R.drawable.kuning));
//        listMateri7.add(new Tema2Materi3("Biru", "android.resource://" + getPackageName() + "/" + R.raw.biru, R.drawable.biru));
//        listMateri7.add(new Tema2Materi3("Hijau", "android.resource://" + getPackageName() + "/" + R.raw.hijau, R.drawable.hijau));
//        listMateri7.add(new Tema2Materi3("Hitam", "android.resource://" + getPackageName() + "/" + R.raw.hitam, R.drawable.hitam));
//        listMateri7.add(new Tema2Materi3("Putih", "android.resource://" + getPackageName() + "/" + R.raw.putih, R.drawable.putih));
//        listMateri7.add(new Tema2Materi3("Persegi", "android.resource://" + getPackageName() + "/" + R.raw.persegi, R.drawable.persegi));
//        listMateri7.add(new Tema2Materi3("Segitiga", "android.resource://" + getPackageName() + "/" + R.raw.segitiga, R.drawable.segitiga));
//        listMateri7.add(new Tema2Materi3("Lingkaran", "android.resource://" + getPackageName() + "/" + R.raw.lingkaran, R.drawable.lingkaran));




        RecyclerView myrv7 = findViewById(R.id.recyclerviewmateri_id);
        Recycler7 myAdapter7 = new Recycler7(this,listMateri7);
        myrv7.setLayoutManager(new GridLayoutManager(this,2));
        myrv7.setAdapter(myAdapter7);
    }
}