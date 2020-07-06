package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class Main1Activity extends AppCompatActivity {

    List<Tema1Materi1> listMateri1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri1 = new ArrayList<>();
        listMateri1.add(new Tema1Materi1("Teman", R.drawable.teman, "android.resource://" + getPackageName() + "/" + R.raw.teman));
//        listMateri1.add(new Tema1Materi1("Aku", R.drawable.aku, "android.resource://" + getPackageName() + "/" + R.raw.aku));
        listMateri1.add(new Tema1Materi1("Kamu", R.drawable.kamu, "android.resource://" + getPackageName() + "/" + R.raw.kamu));
        listMateri1.add(new Tema1Materi1("Kita", R.drawable.kita, "android.resource://" + getPackageName() + "/" + R.raw.kita));
        listMateri1.add(new Tema1Materi1("Bersama", R.drawable.bersama, "android.resource://" + getPackageName() + "/" + R.raw.bersama));
        listMateri1.add(new Tema1Materi1("Nama", R.drawable.nama, "android.resource://" + getPackageName() + "/" + R.raw.nama));
        listMateri1.add(new Tema1Materi1("Kelas", R.drawable.kelas, "android.resource://" + getPackageName() + "/" + R.raw.kelas));
        listMateri1.add(new Tema1Materi1("Bermain", R.drawable.bermain, "android.resource://" + getPackageName() + "/" + R.raw.bermainn));


        RecyclerView myrv1 = findViewById(R.id.recyclerviewmateri_id);
        Recycler1 myAdapter1 = new Recycler1(this,listMateri1);
        myrv1.setLayoutManager(new GridLayoutManager(this,2));
        myrv1.setAdapter(myAdapter1);
    }
}
