package com.example.valdir.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BuscaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_busca.xml
        setContentView(R.layout.activity_busca);

        /*
        * Encontre a Exibição que mostra as telas(tocando, busca, albuns e pagamento)
        */
        Button buttonPlay =  findViewById(R.id.button_playing);
        ImageView imageSearch = findViewById(R.id.image_search);
        ImageView imageAlbums = findViewById(R.id.image_albums);
        ImageView imagePay = findViewById(R.id.image_payment);

        //Clicando no botão play a tela PlayingPodcast será chamada
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuscaActivity.this, PlayingPodcastActivity.class);
                startActivity(i);
            }
        });

        //Clicando no ícone a tela BuscaActivity será chamada
        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuscaActivity.this, BuscaActivity.class);
                startActivity(i);
            }
        });

        //Clicando no ícone Albums a tela AlbumsActivity será chamada
        imageAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuscaActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        //Clicando no ícone Pay a tela PaymentActivity será chamada
        imagePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuscaActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}