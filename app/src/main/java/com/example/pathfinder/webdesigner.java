package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class webdesigner extends AppCompatActivity {
private Button figma1;
    private Button adobe1;
    private Button photoshop5;
    private Button back33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webdesigner);


        figma1=findViewById(R.id.figma);
        figma1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(webdesigner.this,figma.class);
                startActivity(intent);
                finish();
            }
        });

        adobe1=findViewById(R.id.adobe);
        adobe1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(webdesigner.this,adobe.class);
                startActivity(intent);
                finish();
            }
        });


        photoshop5=findViewById(R.id.photoshop);
        photoshop5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(webdesigner.this,traditional.class);
                startActivity(intent);
                finish();
            }
        });

        back33=findViewById(R.id.backtowebdesign);
        back33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(webdesigner.this,webdeveloper.class);
                startActivity(intent);
                finish();
            }
        });
    }
}