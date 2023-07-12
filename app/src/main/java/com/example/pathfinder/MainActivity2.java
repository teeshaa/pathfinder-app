//Home Page

package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
private Button entertainment1;
private Button coding1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        entertainment1=findViewById(R.id.music);
        entertainment1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this,music.class);
                startActivity(intent);
                finish();
            }
        });

        coding1=findViewById(R.id.coding);
        coding1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });

    }
}