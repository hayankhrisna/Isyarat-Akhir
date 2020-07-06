package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<Tema1Materi2> listMateri2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri2 = new ArrayList<>();
//        listMateri2.add(new Tema1Materi2("Tubuh", R.drawable.tubuh, "android.resource://" + getPackageName() + "/" + R.raw.tubuh));
        listMateri2.add(new Tema1Materi2("Kepala", R.drawable.kepala, "android.resource://" + getPackageName() + "/" + R.raw.kepalaa));
        listMateri2.add(new Tema1Materi2("Mata", R.drawable.mata, "android.resource://" + getPackageName() + "/" + R.raw.mata));
        listMateri2.add(new Tema1Materi2("Dahi", R.drawable.dahi, "android.resource://" + getPackageName() + "/" + R.raw.dahi));
        listMateri2.add(new Tema1Materi2("Melihat", R.drawable.melihat, "android.resource://" + getPackageName() + "/" + R.raw.melihat));
        listMateri2.add(new Tema1Materi2("Berjalan", R.drawable.berjalan, "android.resource://" + getPackageName() + "/" + R.raw.berjalan));





        RecyclerView myrv2 = findViewById(R.id.recyclerviewmateri_id);
        Recycler2 myAdapter2 = new Recycler2(this,listMateri2);
        myrv2.setLayoutManager(new GridLayoutManager(this,2));
        myrv2.setAdapter(myAdapter2);
    }
}