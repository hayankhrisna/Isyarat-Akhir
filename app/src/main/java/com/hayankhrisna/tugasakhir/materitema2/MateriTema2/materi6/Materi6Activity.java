package com.hayankhrisna.tugasakhir.materitema2.MateriTema2.materi6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;
import java.util.ArrayList;
import java.util.List;

public class Materi6Activity extends AppCompatActivity {

    List<Tema2Materi2> listMateri6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri6 = new ArrayList<>();
        listMateri6.add(new Tema2Materi2("Menari", "android.resource://" + getPackageName() + "/" + R.raw.menari, R.drawable.menari));
        listMateri6.add(new Tema2Materi2("Musik", "android.resource://" + getPackageName() + "/" + R.raw.musik, R.drawable.musik));
        listMateri6.add(new Tema2Materi2("Gamelan", "android.resource://" + getPackageName() + "/" + R.raw.gamelan, R.drawable.gamelan));
        listMateri6.add(new Tema2Materi2("Suling", "android.resource://" + getPackageName() + "/" + R.raw.suling, R.drawable.suling));
        listMateri6.add(new Tema2Materi2("Gitar", "android.resource://" + getPackageName() + "/" + R.raw.gitar, R.drawable.gitar));
//        listMateri6.add(new Tema2Materi2("Gerak", "android.resource://" + getPackageName() + "/" + R.raw.gerak, R.drawable.gerak));
//        listMateri6.add(new Tema2Materi2("Loncat", "android.resource://" + getPackageName() + "/" + R.raw.loncat, R.drawable.loncat));
        listMateri6.add(new Tema2Materi2("Terbang", "android.resource://" + getPackageName() + "/" + R.raw.terbang, R.drawable.terbang));
        listMateri6.add(new Tema2Materi2("Kanan", "android.resource://" + getPackageName() + "/" + R.raw.kanan, R.drawable.kanan));
        listMateri6.add(new Tema2Materi2("Kiri", "android.resource://" + getPackageName() + "/" + R.raw.kiri,R.drawable.kiri));
        listMateri6.add(new Tema2Materi2("Kucing", "android.resource://" + getPackageName() + "/" + R.raw.kucing, R.drawable.kucing));
//        listMateri6.add(new Tema2Materi2("Kuda", "android.resource://" + getPackageName() + "/" + R.raw.kuda, R.drawable.kuda));
        listMateri6.add(new Tema2Materi2("Kupu-Kupu", "android.resource://" + getPackageName() + "/" + R.raw.kupukupu, R.drawable.kupu));
        listMateri6.add(new Tema2Materi2("Ikan", "android.resource://" + getPackageName() + "/" + R.raw.ikan, R.drawable.ikan));
        listMateri6.add(new Tema2Materi2("Kelinci", "android.resource://" + getPackageName() + "/" + R.raw.kelinci, R.drawable.kelinci));
        listMateri6.add(new Tema2Materi2("Pohon", "android.resource://" + getPackageName() + "/" + R.raw.pohon, R.drawable.pohon));
        listMateri6.add(new Tema2Materi2("Bunga", "android.resource://" + getPackageName() + "/" + R.raw.bunga, R.drawable.bunga));
        listMateri6.add(new Tema2Materi2("Terbang", "android.resource://" + getPackageName() + "/" + R.raw.terbang, R.drawable.terbang));



        RecyclerView myrv6 = findViewById(R.id.recyclerviewmateri_id);
        Recycler6 myAdapter6 = new Recycler6(this,listMateri6);
        myrv6.setLayoutManager(new GridLayoutManager(this,2));
        myrv6.setAdapter(myAdapter6);
    }
}