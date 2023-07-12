
package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Coding extends AppCompatActivity {
    private Button improve1;
    private Button back5;
    private Button startup1;
    private Button game1;
    private Button money1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);
        improve1 = findViewById(R.id.improve);
        improve1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, improve.class);
                startActivity(intent);
                finish();
            }
        });

        startup1 = findViewById(R.id.startup);
        startup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, startup.class);
                startActivity(intent);
                finish();
            }
        });

        game1 = findViewById(R.id.game);
        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, game.class);
                startActivity(intent);
                finish();
            }
        });

        money1 = findViewById(R.id.money);
        money1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, money.class);
                startActivity(intent);
                finish();
            }
        });
//


        back5 = findViewById(R.id.backtohome);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, Home.class);
                startActivity(intent);
                finish();
            }
        });
    }


}