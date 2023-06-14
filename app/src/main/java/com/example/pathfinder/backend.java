package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class backend extends AppCompatActivity {
private Button pro1;
    private Button framework1;
    private Button back23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend);

        pro1 = findViewById(R.id.pro);
        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(backend.this, pro.class);
                startActivity(intent);
                finish();
            }
        });

        framework1 = findViewById(R.id.framework);
        framework1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(backend.this, framework.class);
                startActivity(intent);
                finish();
            }
        });

        back23 = findViewById(R.id.backtofront);
        back23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(backend.this, webdeveloper.class);
                startActivity(intent);
                finish();
            }
        });
    }
}