package com.example.pathfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class datastructure extends AppCompatActivity {
private Button easyds1;
    private Button industryds1;
    private Button back17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure);

        easyds1 = findViewById(R.id.easyds);
        easyds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(datastructure.this, easyds.class);
                startActivity(intent);
                finish();
            }
        });

        industryds1 = findViewById(R.id.industryds);
        industryds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(datastructure.this, industryds.class);
                startActivity(intent);
                finish();
            }
        });

        back17 = findViewById(R.id.backtomoney);
        back17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(datastructure.this, money.class);
                startActivity(intent);
                finish();
            }
        });
    }
}