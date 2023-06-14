package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adobe extends AppCompatActivity {
private Button adobe2;
private Button back35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobe);

        adobe2 =  findViewById(R.id.adobe2);
        adobe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.youtube.com/watch?v=hRTi1Elkz3U&list=PLuRPummNMvIN43IBo1EltezV2ngqYz5T6");
            }
        });

        back35=findViewById(R.id.backtowebdesign2);
        back35.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(adobe.this,webdesigner.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}