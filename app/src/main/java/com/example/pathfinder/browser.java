package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class browser extends AppCompatActivity {
    private Button back7;
    private Button basic1;
    private Button advance1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        back7 = findViewById(R.id.backtobrowser);
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(browser.this, startup.class);
                startActivity(intent);
                finish();
            }
        });

        basic1 = findViewById(R.id.basic);
        basic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(browser.this, basic.class);
                startActivity(intent);
                finish();
            }
        });

        advance1 = findViewById(R.id.advance);
        advance1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(browser.this, advance.class);
                startActivity(intent);
                finish();
            }
        });


    }
}