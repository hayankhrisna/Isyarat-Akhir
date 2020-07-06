package com.hayankhrisna.tugasakhir.Login;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hayankhrisna.tugasakhir.R;

public class SignUp extends AppCompatActivity {

    EditText uname, passr;
    private Siswa siswa;
    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        uname = findViewById(R.id.name);
        passr = findViewById(R.id.pass);

        siswa = new Siswa();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Siswa");
    }

    public void btnRegister(View view) {
        siswa.setNama(uname.getText().toString());
        siswa.setPass(passr.getText().toString());

        ref.child(siswa.getNama()).setValue(siswa).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(SignUp.this, "Daftar Berhasil!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(SignUp.this,"Daftar Gagal!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    public void keLogin(View view) {
        Intent intent = new Intent(SignUp.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
