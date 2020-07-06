package com.hayankhrisna.tugasakhir.materitema1.MateriTema1.materi3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    List<Tema1Materi3> listMateri3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain_materi);

        listMateri3 = new ArrayList<>();
        listMateri3.add(new Tema1Materi3("Gosok Gigi", R.drawable.gosokgigi, "android.resource://" + getPackageName() + "/" + R.raw.gosokgigi));
        listMateri3.add(new Tema1Materi3("Mandi", R.drawable.mandi, "android.resource://" + getPackageName() + "/" + R.raw.mandi));
        listMateri3.add(new Tema1Materi3("Berdoa", R.drawable.berdoa, "android.resource://" + getPackageName() + "/" + R.raw.berdoa));
        listMateri3.add(new Tema1Materi3("Makan", R.drawable.makan, "android.resource://" + getPackageName() + "/" + R.raw.makan));
        listMateri3.add(new Tema1Materi3("Tidur", R.drawable.tidur, "android.resource://" + getPackageName() + "/" + R.raw.tidur));



        RecyclerView myrv3 = findViewById(R.id.recyclerviewmateri_id);
        Recycler3 myAdapter3 = new Recycler3(this,listMateri3);
        myrv3.setLayoutManager(new GridLayoutManager(this,2));
        myrv3.setAdapter(myAdapter3);
    }
}