package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class money extends AppCompatActivity {
private Button back16;
    private Button data1;
    private Button webd1;
    private Button andd1;
    private Button ds1;
    private Button machine1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        back16 = findViewById(R.id.backtohome2);
        back16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, Coding.class);
                startActivity(intent);
                finish();
            }
        });

        data1 = findViewById(R.id.datastructure);
        data1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, datastructure.class);
                startActivity(intent);
                finish();
            }
        });

        webd1 = findViewById(R.id.webdeveloper);
        webd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, webdeveloper.class);
                startActivity(intent);
                finish();
            }
        });

        andd1 = findViewById(R.id.androideveloper);
        andd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, androiddeveloper.class);
                startActivity(intent);
                finish();
            }
        });

        ds1 = findViewById(R.id.datascience);
        ds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, datascience.class);
                startActivity(intent);
                finish();
            }
        });

        machine1 = findViewById(R.id.machine);
        machine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, machine.class);
                startActivity(intent);
                finish();
            }
        });

        back16 = findViewById(R.id.backtohome2);
        back16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(money.this, Coding.class);
                startActivity(intent);
                finish();
            }
        });
    }
}