package com.hayankhrisna.tugasakhir;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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

//        myName.setText(ref.child("Siswa.class"));
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
                    Toast.makeText(MainActivity.this, "Logout Berhasil", Toast.LENGTH_LONG).show();
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

    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);

        startActivity(intent);
        super.onBackPressed();
    }
}
