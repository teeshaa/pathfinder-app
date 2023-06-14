package com.example.pathfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cubase extends AppCompatActivity {
private Button cubasexpaid1;
    private Button cubasexfree1;
    private Button back46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubase);

        cubasexpaid1 = findViewById(R.id.cubasexpaid);
        cubasexpaid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.udemy.com/course/jumpstart-your-music-production-career-with-cubase/?gclid=Cj0KCQiAubmPBhCyARIsAJWNpiPpjE_0bUC5EmTSHe81fn4nwWqIcLH1bHrjawkYPOL2ufiwnNoBbtcaAqVpEALw_wcB&matchtype=b&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_medium=udemyads&utm_source=adwords&utm_term=_._ag_82876607967_._ad_533259445829_._kw_%2Bcubase+%2Bcourse_._de_m_._dm__._pl__._ti_kwd-647104560140_._li_9300408_._pd__._");
            }
        });

        cubasexfree1 = findViewById(R.id.cubasexfree);
        cubasexfree1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://youtube.com/playlist?list=PLvDqXfgufsB5_xoJ9tJrYVIgg5LLg5UVa");
            }
        });

        back46 = findViewById(R.id.backtomusic);
        back46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cubase.this, music.class);
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