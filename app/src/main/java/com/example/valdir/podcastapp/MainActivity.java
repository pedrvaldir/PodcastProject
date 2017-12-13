package com.example.valdir.podcastapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main);

        /*
        * Encontre a Exibição que mostra as telas(tocando, busca, albuns e pagamento)
        * e Envie para o procedimento buttonClickListener a classe a ser chamada.
        */

        buttonClickListener(R.id.image_albums, AlbumsActivity.class);
        buttonClickListener(R.id.image_search, BuscaActivity.class);
        buttonClickListener(R.id.image_payment, PaymentActivity.class);
        buttonClickListener(R.id.button_playing, PlayingPodcastActivity.class);
    }

    private void buttonClickListener(int id, final Class<? extends Activity> clazz ){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, clazz);
                startActivity(i);
            }
        });
    }
}