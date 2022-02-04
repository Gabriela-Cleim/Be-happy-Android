package com.example.behappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telaquatro extends AppCompatActivity {

    Button bt_prox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaquatro);

        bt_prox=findViewById(R.id.bt_prox);

        bt_prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Telacinco=new Intent(view.getContext(), Telacinco.class);
                startActivity(Telacinco);
            }
        });
    }
}