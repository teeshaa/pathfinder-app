package com.example.pathfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class apple extends AppCompatActivity {
private Button back10;
    private Button swift1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        back10=findViewById(R.id.backtostartup);
        back10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(apple.this,startup.class);
                startActivity(intent);
                finish();
            }
        });

        swift1=  findViewById(R.id.swift);
        swift1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.youtube.com/watch?v=bjPENR6sHRU&list=PL5PR3UyfTWvfacnfUsvNcxIiKIgidNRoW");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}