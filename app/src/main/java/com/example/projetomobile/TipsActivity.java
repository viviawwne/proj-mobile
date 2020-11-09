package com.example.projetomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipsActivity extends AppCompatActivity {

    private Button btnNext;
    private Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        btnNext = findViewById(R.id.btnNext);

    }

    @Override
    protected void onStart() {
        super.onStart();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tips_2);
                setBtn();
            }
        });

    }

    private void setBtn(){
        btnPrev = findViewById(R.id.btnPrev);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_tips);
            }
        });
    }
}