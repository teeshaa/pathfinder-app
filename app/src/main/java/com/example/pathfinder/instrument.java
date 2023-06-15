package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class instrument extends AppCompatActivity {
    private Button tablax1;
    private Button pianox1;
    private Button harmx1;
    private Button flutex1;
    private Button back45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);


        tablax1 = findViewById(R.id.tablax);
        tablax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PLbAzI1rqV3WK2c6M6mG3G3HXQy05q_KP_");
            }
        });


        pianox1 = findViewById(R.id.pianox);
        pianox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PLA7CFEAE94795CF3F");
            }
        });

        harmx1 = findViewById(R.id.harmx);
        harmx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PL0NcHGRq0rWY6lzH2tT5sEzjnEjuYuzJy");
            }
        });
        flutex1 = findViewById(R.id.flutex);
        flutex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PL2qvHwo3Zh_LKLiRXGZguyinPHqQViFOG");
            }
        });

        back45 = findViewById(R.id.backtomusic);
        back45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(instrument.this, music.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));


    }
}