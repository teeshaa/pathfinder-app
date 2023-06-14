package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guitar extends AppCompatActivity {
private Button guitarx1;
    private Button back43;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        guitarx1 = findViewById(R.id.guitarx);
        guitarx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PLcJdgAZAV7LEyJICI4Np9XK8cVXa0nfPj");
            }
        });

        back43 = findViewById(R.id.backtomusic);
        back43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guitar.this, music.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));


    }
}