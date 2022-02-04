package com.example.behappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telaseis extends AppCompatActivity {

    Button bt_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaseis);

        bt_voltar=findViewById(R.id.bt_voltar);

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Teladois=new Intent(view.getContext(), Teladois.class);
                startActivity(Teladois);
            }
        });
    }
}