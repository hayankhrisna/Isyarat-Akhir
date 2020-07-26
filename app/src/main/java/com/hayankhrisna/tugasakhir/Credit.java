package com.hayankhrisna.tugasakhir;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
    }

    public void eucalycp(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/authors/eucalyp")));
    }

    public void freepik(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/authors/freepik")));
    }

    public void ultima(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/authors/ultimatearm")));
    }

    public void becris(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.flaticon.com/authors/becris")));
    }
}
