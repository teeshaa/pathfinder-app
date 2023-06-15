package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class androiddeveloper extends AppCompatActivity {
    private Button easyand1;
    private Button mediumand1;
    private Button hardand1;
    private Button back26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androiddeveloper);

        easyand1 = findViewById(R.id.easyand);
        easyand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(androiddeveloper.this, easyand.class);
                startActivity(intent);
                finish();
            }
        });

        mediumand1 = findViewById(R.id.mediumand);
        mediumand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(androiddeveloper.this, mediumand.class);
                startActivity(intent);
                finish();
            }
        });

        hardand1 = findViewById(R.id.hardand);
        hardand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(androiddeveloper.this, hardand.class);
                startActivity(intent);
                finish();
            }
        });


        back26 = findViewById(R.id.backtomoney);
        back26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(androiddeveloper.this, money.class);
                startActivity(intent);
                finish();
            }
        });


    }
}