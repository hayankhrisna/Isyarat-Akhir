package com.hayankhrisna.tugasakhir.dasarfile;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.hayankhrisna.tugasakhir.R;

import java.util.ArrayList;
import java.util.List;

public class HalamanBhsDasar extends AppCompatActivity {

    List<Dasar> listDasar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_bhs_dasar);
        Intent intent = getIntent();

        listDasar = new ArrayList<>();
        listDasar.add(new Dasar("Huruf A",R.drawable.aa));
        listDasar.add(new Dasar("Huruf B",R.drawable.ab));
        listDasar.add(new Dasar("Huruf C",R.drawable.ac));
        listDasar.add(new Dasar("Huruf D",R.drawable.ad));
        listDasar.add(new Dasar("Huruf E",R.drawable.ae));
        listDasar.add(new Dasar("Huruf F",R.drawable.af));
        listDasar.add(new Dasar("Huruf G",R.drawable.ag));
        listDasar.add(new Dasar("Huruf H",R.drawable.ah));
        listDasar.add(new Dasar("Huruf I",R.drawable.ai));
        listDasar.add(new Dasar("Huruf K",R.drawable.ak));
        listDasar.add(new Dasar("Huruf L",R.drawable.al));
        listDasar.add(new Dasar("Huruf M",R.drawable.am));
        listDasar.add(new Dasar("Huruf N",R.drawable.an));
        listDasar.add(new Dasar("Huruf P",R.drawable.ap));
        listDasar.add(new Dasar("Huruf Q",R.drawable.aq));
        listDasar.add(new Dasar("Huruf R",R.drawable.ar));
        listDasar.add(new Dasar("Huruf S",R.drawable.as));
        listDasar.add(new Dasar("Huruf T",R.drawable.at));
        listDasar.add(new Dasar("Huruf U",R.drawable.au));
        listDasar.add(new Dasar("Huruf V",R.drawable.av));
        listDasar.add(new Dasar("Huruf W",R.drawable.aw));
        listDasar.add(new Dasar("Huruf X",R.drawable.ax));
        listDasar.add(new Dasar("Huruf Y",R.drawable.ay));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerviewAdapterDasar myAdapter = new RecyclerviewAdapterDasar(this, listDasar);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}


