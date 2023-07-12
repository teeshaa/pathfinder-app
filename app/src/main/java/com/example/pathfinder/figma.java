package com.example.pathfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class figma extends AppCompatActivity {
private Button figma2;
private Button back34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figma);

        figma2 =  findViewById(R.id.figma2);
        figma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.youtube.com/watch?v=iFQw7S02X-Y&list=PLuRPummNMvINdAbI_WT7R5vdjcyRPeRiq");
            }
        });

        back34=findViewById(R.id.backtowebdesign2);
        back34.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(figma.this,webdesigner.class);
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