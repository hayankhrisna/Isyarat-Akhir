package com.hayankhrisna.tugasakhir.Login;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.hayankhrisna.tugasakhir.MainActivity;
import com.hayankhrisna.tugasakhir.R;

public class LoginActivity extends AppCompatActivity {

    EditText name, passd;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.username);
        passd = findViewById(R.id.password);

        ref = FirebaseDatabase.getInstance().getReference().child("Siswa");
    }
    String password;
    public void btnLogin(View view) {
        final String nama = name.getText().toString();
        password = passd.getText().toString();

        try{
            ref.child(nama).addValueEventListener(new ValueEventListener() {


                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    try {
                        Siswa siswa = dataSnapshot.getValue(Siswa.class);
                        Log.e("JANCOK",password);
                        Log.e("JANCOK",nama);
                        Log.e("JANCOK",siswa.getNama());

                        if (password.equals(siswa.getPass())) {
                            Toast.makeText(LoginActivity.this,
                                    "Berhasil Login!", Toast.LENGTH_LONG).show();
                            SharedPreferences mSettings = LoginActivity.this.getSharedPreferences("DATA", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = mSettings.edit();
                            editor.putString("NAMA", siswa.getNamalengkap());
                            editor.apply();

                            Intent start = new Intent(LoginActivity.this, MainActivity.class);
                            start.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                            startActivity(start);
                        } else {
                            Toast.makeText(LoginActivity.this,
                                    "Data Salah!", Toast.LENGTH_LONG).show();
                        }
                    } catch (Exception ex) {
                        Toast.makeText(LoginActivity.this,
                                "Nama Kamu Tidak Ada!", Toast.LENGTH_LONG).show();

                        ex.printStackTrace();
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        } catch (Exception ex){
            Toast.makeText(LoginActivity.this,
                    "Nama Kamu Tidak Ada!", Toast.LENGTH_LONG).show();

            ex.printStackTrace();
        }
    }

    public void keSignUp(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUp.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
