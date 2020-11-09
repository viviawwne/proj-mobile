package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projetomobile.FrasesActivity.Aeroporto;
import com.example.projetomobile.FrasesActivity.Hotel;
import com.example.projetomobile.FrasesActivity.Restaurante;
import com.example.projetomobile.FrasesActivity.Saudacoes;
import com.example.projetomobile.FrasesActivity.Supermercado;

import org.w3c.dom.Text;

public class LivroDeFrases extends AppCompatActivity {

    private TextView btnAero;
    private TextView btnRes;
    private TextView btnHot;
    private TextView btnSuper;
    private TextView btnSau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro_de_frases);

        btnAero = findViewById(R.id.btnAero);
        btnRes = findViewById(R.id.btnRes);
        btnHot = findViewById(R.id.btnHot);
        btnSuper = findViewById(R.id.btnSuper);
        btnSau = findViewById(R.id.btnSau);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prox = new Intent(LivroDeFrases.this, Aeroporto.class);
                startActivity(prox);
            }
        });

        btnSau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prox = new Intent(LivroDeFrases.this, Saudacoes.class);
                startActivity(prox);
            }
        });

        btnSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prox = new Intent(LivroDeFrases.this, Supermercado.class);
                startActivity(prox);
            }
        });

        btnHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prox = new Intent(LivroDeFrases.this, Hotel.class);
                startActivity(prox);
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prox = new Intent(LivroDeFrases.this, Restaurante.class);
                startActivity(prox);
            }
        });
    }
}