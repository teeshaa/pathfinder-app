package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class startup extends AppCompatActivity {
private Button back6;
private Button browser1;
private Button apple1;
private Button android1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        back6=findViewById(R.id.backtostartup);
        back6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(startup.this, coding.class);
                startActivity(intent);
                finish();
            }
        });

        browser1=findViewById(R.id.browser);
        browser1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(startup.this,browser.class);
                startActivity(intent);
                finish();
            }
        });


        apple1=findViewById(R.id.apple);
        apple1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(startup.this,apple.class);
                startActivity(intent);
                finish();
            }
        });

        android1=findViewById(R.id.android);
        android1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(startup.this,android.class);
                startActivity(intent);
                finish();
            }
        });



    }
}