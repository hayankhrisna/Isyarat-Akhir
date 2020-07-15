package com.hayankhrisna.tugasakhir.LatihanSoal;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.autofill.AutofillId;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.hayankhrisna.tugasakhir.R;

public class SoalTema1 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView question1,timer;
    int total=0;
//    String total;
//    int jumlah=0;
    int correct=0;
    int wrong=0;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        question1=findViewById(R.id.question);
        timer=findViewById(R.id.timer);
        b1=findViewById(R.id.oprion1);
        b2=findViewById(R.id.oprion2);
        b3=findViewById(R.id.oprion3);
        b4=findViewById(R.id.oprion4);
        UpdateQuestion();
        reversetimer(1000,timer);
    }

    private void UpdateQuestion() {
        total++;
        if (total > 5){
            //open result activity
        }
        else {
//            String mGroupId = myRef.push().getKey();
            myRef= FirebaseDatabase.getInstance().getReference().child("Questions").child(String.valueOf(total));
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    final Question question = dataSnapshot.getValue(Question.class);

                    question1.setText(question.getQuestion());
                    b1.setText(question.getOption1());
                    b2.setText(question.getOption2());
                    b3.setText(question.getOption3());
                    b4.setText(question.getOption4());
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (b1.getText().toString().equals(question.getAnswer())){
                                b1.setBackgroundColor(Color.GREEN);
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        correct++;
                                        b1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);

                            }else {
                                wrong++;
                                b1.setBackgroundColor(Color.RED);
                                if (b2.getText().toString().equals(question.getAnswer())){
                                    b2.setBackgroundColor(Color.GREEN);
                                }
                                else if (b3.getText().toString().equals(question.getAnswer())){
                                    b3.setBackgroundColor(Color.GREEN);
                                }
                                else if (b4.getText().toString().equals(question.getAnswer())){
                                    b4.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
//                                        correct++;
                                        b1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);
                            }
                        }
                    });
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (b2.getText().toString().equals(question.getAnswer())){
                                b2.setBackgroundColor(Color.GREEN);
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        correct++;
                                        b2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);

                            }else {
                                wrong++;
                                b2.setBackgroundColor(Color.RED);
                                if (b1.getText().toString().equals(question.getAnswer())){
                                    b1.setBackgroundColor(Color.GREEN);
                                }
                                else if (b3.getText().toString().equals(question.getAnswer())){
                                    b3.setBackgroundColor(Color.GREEN);
                                }
                                else if (b4.getText().toString().equals(question.getAnswer())){
                                    b4.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
//                                      correct++;
                                        b1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);
                            }
                        }
                    });
                    b3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (b3.getText().toString().equals(question.getAnswer())){
                                b3.setBackgroundColor(Color.GREEN);
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        correct++;
                                        b3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);

                            }else {
                                wrong++;
                                b3.setBackgroundColor(Color.RED);
                                if (b1.getText().toString().equals(question.getAnswer())){
                                    b1.setBackgroundColor(Color.GREEN);
                                }
                                else if (b2.getText().toString().equals(question.getAnswer())){
                                    b2.setBackgroundColor(Color.GREEN);
                                }
                                else if (b4.getText().toString().equals(question.getAnswer())){
                                    b4.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
//                                      correct++;
                                        b1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);
                            }
                        }

                    });
                    b4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (b4.getText().toString().equals(question.getAnswer())){
                                b4.setBackgroundColor(Color.GREEN);
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        correct++;
                                        b4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);

                            }else {
                                wrong++;
                                b4.setBackgroundColor(Color.RED);
                                if (b1.getText().toString().equals(question.getAnswer())){
                                    b1.setBackgroundColor(Color.GREEN);
                                }
                                else if (b2.getText().toString().equals(question.getAnswer())){
                                    b2.setBackgroundColor(Color.GREEN);
                                }
                                else if (b3.getText().toString().equals(question.getAnswer())){
                                    b3.setBackgroundColor(Color.GREEN);
                                }
                                Handler handler=new Handler();
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
//                                      correct++;
                                        b1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        b4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        UpdateQuestion();
                                    }
                                },500);
                            }

                        }
                    });


                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
    }
    public void reversetimer(int seconds,final TextView timer){
        new CountDownTimer(30000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("Sisa Waktu: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                timer.setText("Completed");
                Intent intent=new Intent(SoalTema1.this, ResultActivity.class);
                intent.putExtra("total",String.valueOf(total));
                intent.putExtra("correct",String.valueOf(correct));
                intent.putExtra("incorrect",String.valueOf(wrong));
                startActivity(intent);
            }
        }.start();

    }
}
