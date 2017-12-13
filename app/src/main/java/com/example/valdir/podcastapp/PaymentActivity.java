package com.example.valdir.podcastapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_payment.xml
        setContentView(R.layout.activity_payment);

        /*
        * Encontre a Exibição que mostra as telas(busca e albúns)
        */

        buttonClickListener(R.id.image_search, BuscaActivity.class);
        buttonClickListener(R.id.image_albums, AlbumsActivity.class);

    }

    private void buttonClickListener(int id, final Class<? extends Activity> clazz){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentActivity.this, clazz);
                startActivity(i);
            }
        });
    }
}
