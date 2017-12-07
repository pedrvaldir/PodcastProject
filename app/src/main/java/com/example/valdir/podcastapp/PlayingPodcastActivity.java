package com.example.valdir.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlayingPodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_podcast);

        ImageView imageSearch = findViewById(R.id.image_search);
        ImageView imageAlbums = findViewById(R.id.image_albums);
        ImageView imagePay = findViewById(R.id.image_payment);

        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, BuscaActivity.class);
                startActivity(i);
            }
        });

        imageAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        imagePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}
