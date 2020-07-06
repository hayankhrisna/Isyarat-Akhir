package com.hayankhrisna.tugasakhir.dasarfile;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.hayankhrisna.tugasakhir.R;

public class Dasar_Activity extends AppCompatActivity {

    private TextView tvtitle;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdasar);

        tvtitle = (TextView) findViewById(R.id.txttitle);
        img = (ImageView) findViewById(R.id.dasarthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values
        tvtitle.setText(Title);
        img.setImageResource(image);
    }
}
