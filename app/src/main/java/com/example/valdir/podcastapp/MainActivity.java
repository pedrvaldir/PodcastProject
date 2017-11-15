package com.example.valdir.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mAllPodCasts;
    private TextView mCategorias;
    private TextView mAudioBooks;
    private TextView mDownloads;
    private TextView mBuscar;
    private TextView mSobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main);

        /*Encontre a Exibição que mostra cada categoria
           1-Podcasts 2-Categorias 3-AudioBooks 4-Downloads 5-Sobre
        */
        mAllPodCasts = findViewById(R.id.allPodCasts);
        mCategorias = findViewById(R.id.categoria);
        mAudioBooks =  findViewById(R.id.audiobooks);
        mDownloads =  findViewById(R.id.downloads);
        mBuscar = findViewById(R.id.buscas);
        mSobre =  findViewById(R.id.sobre);

        // O código neste método será executado quando a categoria de PoadCasts for clicada.
        mAllPodCasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allPodCastsIntent = new Intent(MainActivity.this, AllpodcastsActivity.class);
                startActivity(allPodCastsIntent);
            }
        });

        // O código neste método será executado quando o grupo Categorias for clicada.
        mCategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoriasIntent = new Intent(MainActivity.this, CategoriaActivity.class);
                startActivity(categoriasIntent);
            }
        });

        // O código neste método será executado quando o grupo AudioBooks for clicada.
        mAudioBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent audioBooksIntent = new Intent(MainActivity.this, AudioBooksActivity.class);
                startActivity(audioBooksIntent);
            }
        });

        // O código neste método será executado quando o grupo Downloads for clicada.
        mDownloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadsIntent = new Intent(MainActivity.this, DownloadsActivity.class);
                startActivity(downloadsIntent);
            }
        });

        // O código neste método será executado quando o grupo Buscar for clicada.
        mBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buscarIntent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(buscarIntent);
            }
        });

        // O código neste método será executado quando o grupo Sobre for clicada.
        mSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sobreIntent = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(sobreIntent);
            }
        });
    }
}