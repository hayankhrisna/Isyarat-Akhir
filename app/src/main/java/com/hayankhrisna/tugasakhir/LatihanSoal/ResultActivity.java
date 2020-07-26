package com.hayankhrisna.tugasakhir.LatihanSoal;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hayankhrisna.tugasakhir.HalamanSoal;
import com.hayankhrisna.tugasakhir.Login.LoginActivity;
import com.hayankhrisna.tugasakhir.Login.SignUp;
import com.hayankhrisna.tugasakhir.R;

public class ResultActivity extends AppCompatActivity {

    TextView t2, t3;
    Dialog myDialog;
    TextView txtclose;
    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        myDialog = new Dialog(ResultActivity.this);

        myDialog.setContentView(R.layout.showpopup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("X");

        t2 = myDialog.findViewById(R.id.benar);
        t3 = myDialog.findViewById(R.id.salah);

        Intent i = getIntent();

        String correct = i.getStringExtra("correct");
        int benar = Integer.parseInt(correct);
        final Nilai nilai = new Nilai();
        double akhir = ( (double) benar / 5f ) * 100f;

        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Nilai");
        SharedPreferences mSettings = this.getSharedPreferences("DATA", Context.MODE_PRIVATE);
        String namaLengkap = mSettings.getString("NAMA", "null");

        nilai.setNilai(String.valueOf(akhir));
        nilai.setNamalengkapNilai(namaLengkap);

        ref.push().setValue(nilai).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
               Log.e("TEST",nilai.nilai);
            }
        });

        Log.e("NILAI",String.valueOf(akhir));

        String wrong = i.getStringExtra("incorrect");
//        t1.setText(question);
        t2.setText(correct);
        t3.setText(wrong);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
                Intent intent = new Intent(ResultActivity.this, HalamanSoal.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.setCanceledOnTouchOutside(false); //klik luar gabisa keluar
        myDialog.setCancelable(false); //klik back gabisa keluar
        myDialog.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}