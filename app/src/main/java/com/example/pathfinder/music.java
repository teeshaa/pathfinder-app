package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity {
private Button singer1;
    private Button guitar1;
    private Button instrument1;
    private Button cubase1;
    private Button musictherapy1;
    private Button voiceover1;
    private Button audioengineer1;
    private Button back41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        singer1=findViewById(R.id.singer);
        singer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,singer.class);
                startActivity(intent);
                finish();
            }
        });

        guitar1=findViewById(R.id.guitar);
        guitar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,guitar.class);
                startActivity(intent);
                finish();
            }
        });


        instrument1=findViewById(R.id.instrument);
        instrument1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,instrument.class);
                startActivity(intent);
                finish();
            }
        });

        cubase1=findViewById(R.id.cubase);
        cubase1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,cubase.class);
                startActivity(intent);
                finish();
            }
        });


        musictherapy1=findViewById(R.id.musictherapy);
        musictherapy1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,musictherapy.class);
                startActivity(intent);
                finish();
            }
        });

        voiceover1=findViewById(R.id.voiceover);
        voiceover1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,voiceover.class);
                startActivity(intent);
                finish();
            }
        });

        audioengineer1=findViewById(R.id.audioengineer);
        audioengineer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,audioengineer.class);
                startActivity(intent);
                finish();
            }
        });

        back41=findViewById(R.id.backtoenter);
        back41.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(music.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}