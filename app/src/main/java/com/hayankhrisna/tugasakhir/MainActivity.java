package com.hayankhrisna.tugasakhir;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.hayankhrisna.tugasakhir.Login.LoginActivity;
import com.hayankhrisna.tugasakhir.Login.Siswa;
import com.hayankhrisna.tugasakhir.dasarfile.HalamanBhsDasar;



public class MainActivity extends AppCompatActivity {

    TextView myName;
    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        myName = findViewById(R.id.user);
        SharedPreferences mSettings = this.getSharedPreferences("DATA", Context.MODE_PRIVATE);
        String namaLengkap = mSettings.getString("NAMA", "null");

        myName.setText(namaLengkap);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Siswa");
    }

    public void launchMateri(View view) {
        Intent intent = new Intent(MainActivity.this, HalamanMateri.class);
        startActivity(intent);
    }

    public void launchDasar(View view) {
        Intent intent = new Intent(MainActivity.this, HalamanBhsDasar.class);
        startActivity(intent);
    }

    public void launchHalamanSoal(View view) {
        Intent intent = new Intent(MainActivity.this, HalamanSoal.class);
        startActivity(intent);
    }

    public void btnLogout(View view) {
        ref.getDatabase().getReference().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Siswa siswa = snapshot.getValue(Siswa.class);
                if (siswa != null) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(MainActivity.this,
                            "Gagal Logout!", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    public void btnCredit(View view) {
    }

    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);

        startActivity(intent);
        super.onBackPressed();
    }


}
