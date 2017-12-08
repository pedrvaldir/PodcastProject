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

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_playing_podcast.xml
        setContentView(R.layout.activity_playing_podcast);

        /*
        * Encontre a Exibição que mostra as telas(pagamento, busca e albúns)
        */
        ImageView imageSearch = findViewById(R.id.image_search);
        ImageView imageAlbums = findViewById(R.id.image_albums);
        ImageView imagePay = findViewById(R.id.image_payment);

        //Clicando no ícone a tela BuscaActivity será chamada
        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, BuscaActivity.class);
                startActivity(i);
            }
        });

        //Clicando no ícone Albums a tela AlbumsActivity será chamada
        imageAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        //Clicando no ícone Pay a tela PaymentActivity será chamada
        imagePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayingPodcastActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}