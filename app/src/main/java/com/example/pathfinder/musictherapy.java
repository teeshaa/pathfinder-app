package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class musictherapy extends AppCompatActivity {
    private Button therapypaid1;
    private Button therapywhat1;
    private Button back47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musictherapy);

        therapypaid1 = findViewById(R.id.therapypaid);
        therapypaid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.udemy.com/course/music-therapy-and-body-based-consciousness/");
            }
        });

        therapywhat1 = findViewById(R.id.therapywhat);
        therapywhat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtu.be/QzzpfsgxNxE/");
            }
        });

        back47 = findViewById(R.id.backtomusic);
        back47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(musictherapy.this, music.class);
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