package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;
import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    List<Tema1Materi4> listMateri4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri4 = new ArrayList<>();
        listMateri4.add(new Tema1Materi4("Keluarga", R.drawable.keluarga, "android.resource://" + getPackageName() + "/" + R.raw.keluarga));
        listMateri4.add(new Tema1Materi4("Topi", R.drawable.topi, "android.resource://" + getPackageName() + "/" + R.raw.topi));




        RecyclerView myrv4 = findViewById(R.id.recyclerviewmateri_id);
        Recycler4 myAdapter4 = new Recycler4(this,listMateri4);
        myrv4.setLayoutManager(new GridLayoutManager(this,2));
        myrv4.setAdapter(myAdapter4);
    }
}