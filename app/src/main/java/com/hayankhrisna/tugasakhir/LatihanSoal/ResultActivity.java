package com.hayankhrisna.tugasakhir.LatihanSoal;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hayankhrisna.tugasakhir.HalamanSoal;
import com.hayankhrisna.tugasakhir.R;

public class ResultActivity extends AppCompatActivity {

    TextView t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
//        t1=findViewById(R.id.textView4);
        t2=findViewById(R.id.textView5);
        t3=findViewById(R.id.textView6);

        Intent i=getIntent();
//        String question=i.getStringExtra("total");
        String correct=i.getStringExtra("correct");
        String wrong=i.getStringExtra("incorrect");
//        t1.setText(question);
        t2.setText(correct);
        t3.setText(wrong);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ResultActivity.this, HalamanSoal.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
