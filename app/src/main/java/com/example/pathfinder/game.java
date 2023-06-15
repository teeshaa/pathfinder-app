package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game extends AppCompatActivity {
    private Button back12;
    private Button simple1;
    private Button unity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        back12 = findViewById(R.id.backtostartup);
        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(game.this, MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });

        simple1 = findViewById(R.id.simple);
        simple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(game.this, simple.class);
                startActivity(intent);
                finish();
            }
        });

        unity1 = findViewById(R.id.unity);
        unity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(game.this, unity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}