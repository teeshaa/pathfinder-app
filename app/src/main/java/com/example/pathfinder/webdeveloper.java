package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class webdeveloper extends AppCompatActivity {
private Button front1;
private Button backend1;
private Button back19;
    private Button webdesign1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webdeveloper);

        front1 = findViewById(R.id.frontend);
        front1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(webdeveloper.this, frontend.class);
                startActivity(intent);
                finish();
            }
        });

        backend1 = findViewById(R.id.backend);
        backend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(webdeveloper.this, backend.class);
                startActivity(intent);
                finish();
            }
        });

        webdesign1 = findViewById(R.id.webdesigner);
        webdesign1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(webdeveloper.this, webdesigner.class);
                startActivity(intent);
                finish();
            }
        });

        back19 = findViewById(R.id.backtowebd);
        back19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(webdeveloper.this, money.class);
                startActivity(intent);
                finish();
            }
        });

    }
}