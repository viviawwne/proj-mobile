package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HelloActivity extends AppCompatActivity {

    private ImageButton btnDicas;
    private ImageButton btnFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        btnDicas = (ImageButton) findViewById(R.id.btnDicas);
        btnFrases = (ImageButton) findViewById(R.id.btnFrases);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dicas = new Intent(HelloActivity.this, TipsActivity.class);
                startActivity(dicas);
            }
        });

        btnFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frases = new Intent(HelloActivity.this, LivroDeFrases.class);
                startActivity(frases);
            }
        });
    }
}
