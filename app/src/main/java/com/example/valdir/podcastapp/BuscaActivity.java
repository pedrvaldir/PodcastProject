package com.example.valdir.podcastapp;

import android.app.Activity;
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

        buttonClickListener(R.id.button_playing, PlayingPodcastActivity.class);
        buttonClickListener(R.id.image_search, BuscaActivity.class);
        buttonClickListener(R.id.image_albums, AlbumsActivity.class);
        buttonClickListener(R.id.image_payment, PaymentActivity.class);
    }

    private void buttonClickListener(int id, final Class<? extends Activity> clazz){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BuscaActivity.this, clazz);
                startActivity(i);
            }
        });

    }
}