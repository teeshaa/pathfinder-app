package com.example.pathfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class adobe extends AppCompatActivity {
    private Button adobe2;
    private Button back35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobe);

        adobe2 = findViewById(R.id.adobe2);
        adobe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the provided URL when adobe2 button is clicked (Free Course Link)
                gotoUrl("https://www.youtube.com/watch?v=hRTi1Elkz3U&list=PLuRPummNMvIN43IBo1EltezV2ngqYz5T6");
            }
        });

        back35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to the webdesigner activity when back35 button is clicked
                Intent intent = new Intent(adobe.this, webdesigner.class);
                startActivity(intent);
                finish();
            }
        });
    }

    // To Open a provided URL in a browser
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
