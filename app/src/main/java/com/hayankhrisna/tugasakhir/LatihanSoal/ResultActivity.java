package com.hayankhrisna.tugasakhir.LatihanSoal;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hayankhrisna.tugasakhir.HalamanSoal;
import com.hayankhrisna.tugasakhir.R;

public class ResultActivity extends AppCompatActivity {

    TextView t2, t3;
    Dialog myDialog;
    TextView txtclose;

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
        String wrong = i.getStringExtra("incorrect");
//        t1.setText(question);
        t2.setText(correct);
        t3.setText(wrong);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
                Intent intent = new Intent(ResultActivity.this, HalamanSoal.class);
                startActivity(intent);
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