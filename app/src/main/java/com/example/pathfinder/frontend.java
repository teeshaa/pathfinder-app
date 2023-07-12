package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frontend extends AppCompatActivity {
private Button front2;
    private Button ad1;
    private Button back20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend);

        front2 = findViewById(R.id.frontbasic);
        front2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(frontend.this, frontbasic.class);
                startActivity(intent);
                finish();
            }
        });

        ad1 = findViewById(R.id.frontad);
        ad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(frontend.this, frontad.class);
                startActivity(intent);
                finish();
            }
        });

        back20 = findViewById(R.id.backtofront);
        back20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(frontend.this, webdeveloper.class);
                startActivity(intent);
                finish();
            }
        });
    }
}