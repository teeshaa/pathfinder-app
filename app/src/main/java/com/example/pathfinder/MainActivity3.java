//Home-->Entertainment

package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
private Button music1;
    private Button dance1;
    private Button filmmaking1;
    private Button acting1;
    private Button photographer1;
    private Button videoeditor1;
    private Button back40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        music1=findViewById(R.id.music);
        music1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,music.class);
                startActivity(intent);
                finish();
            }
        });

        dance1=findViewById(R.id.dance);
        dance1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,dance.class);
                startActivity(intent);
                finish();
            }
        });


        filmmaking1=findViewById(R.id.filmmaking);
        filmmaking1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,filmmaking.class);
                startActivity(intent);
                finish();
            }
        });

        acting1=findViewById(R.id.acting);
        acting1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,acting.class);
                startActivity(intent);
                finish();
            }
        });


        photographer1=findViewById(R.id.photographer);
        photographer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,photographer.class);
                startActivity(intent);
                finish();
            }
        });

        videoeditor1=findViewById(R.id.videoeditor);
        videoeditor1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,videoeditor.class);
                startActivity(intent);
                finish();
            }
        });

        back40=findViewById(R.id.backtohome);
        back40.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}