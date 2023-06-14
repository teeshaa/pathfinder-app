package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class audioengineer extends AppCompatActivity {
private Button audiox1;
private Button audiowhat1;
private Button back51;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audioengineer);

        audiox1 = findViewById(R.id.audiox);
        audiox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.udemy.com/course/audio-production-course/");
            }
        });

        audiowhat1 = findViewById(R.id.audiowhat);
        audiowhat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://open.spotify.com/episode/6TgDv1CzSAl7qSZqR32dh3?si=NNtlusn3QbaZb1Iq-Heqcw&utm_source=copy-link");
            }
        });



        back51 = findViewById(R.id.backtomusic);
        back51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(audioengineer.this, music.class);
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