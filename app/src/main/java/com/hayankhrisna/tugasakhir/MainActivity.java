package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hayankhrisna.tugasakhir.Login.LoginActivity;
import com.hayankhrisna.tugasakhir.dasarfile.HalamanBhsDasar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
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
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
