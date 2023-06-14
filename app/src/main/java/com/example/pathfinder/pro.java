package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pro extends AppCompatActivity {
private Button back25;
private Button php1;
private Button js1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

    back25=findViewById(R.id.backtobackend);
        back25.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(pro.this,backend.class);
            startActivity(intent);
            finish();
        }
    });

    php1=  findViewById(R.id.php);
        php1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            gotoUrl("https://www.youtube.com/watch?v=at19OmH2Bg4&list=PLu0W_9lII9aikXkRE0WxDt1vozo3hnmtR");
        }
    });

    js1=  findViewById(R.id.js);
        js1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            gotoUrl("https://www.youtube.com/watch?v=cvvwkgp4HBg&list=PLu0W_9lII9ajyk081To1Cbt2eI5913SsL");
        }
    });
}
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}