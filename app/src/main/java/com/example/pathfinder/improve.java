package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class improve extends AppCompatActivity {
private Button easy1;
private Button medium1;
private Button hard1;
private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve);
        easy1=findViewById(R.id.easypython);
        easy1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(improve.this,easy_improve.class);
                startActivity(intent);
                finish();
            }
        });

        medium1=findViewById(R.id.medium);
        medium1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(improve.this,medium_improve.class);
                startActivity(intent);
                finish();
            }
        });

        hard1=findViewById(R.id.hard);
        hard1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(improve.this,hard_improve.class);
                startActivity(intent);
                finish();
            }
        });

        back1=findViewById(R.id.backtoimprove);
        back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(improve.this,MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}