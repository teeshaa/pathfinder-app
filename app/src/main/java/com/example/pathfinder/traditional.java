package com.example.pathfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class traditional extends AppCompatActivity {
    private Button photoshop2;
    private Button back36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional);

        photoshop2 =  findViewById(R.id.photoshop2);
        photoshop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.youtube.com/watch?v=jFfd0RYax5k&list=PL7JpMMpENaD3KL_lvmw4eS5U5AD746yKB");
            }
        });

        back36=findViewById(R.id.backtowebdes);
        back36.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(traditional.this,webdesigner.class);
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