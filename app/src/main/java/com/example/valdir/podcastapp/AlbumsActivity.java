package com.example.valdir.podcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

         /*Encontre a Exibição que mostra cada categoria
        */
        ImageView imagePay = findViewById(R.id.image_payment);
        ImageView imageSearch = findViewById(R.id.image_search);


        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlbumsActivity.this, BuscaActivity.class);
                startActivity(i);
            }
        });

        imagePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlbumsActivity.this, PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}
