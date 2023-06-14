package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class easyand extends AppCompatActivity {
private Button back27;
private Button kotlin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyand);

        back27=findViewById(R.id.backtoandroid);
        back27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(easyand.this,androiddeveloper.class);
                startActivity(intent);
                finish();
            }
        });

        kotlin1=  findViewById(R.id.kotlin);
        kotlin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.youtube.com/watch?v=NosAkIKgA4Y&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G");
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}