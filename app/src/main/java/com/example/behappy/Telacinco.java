package com.example.behappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telacinco extends AppCompatActivity {
    Button bt_proxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacinco);

        bt_proxi=findViewById(R.id.bt_proxi);

        bt_proxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Telaseis=new Intent(view.getContext(), Telaseis.class);
                startActivity(Telaseis);
            }
        });


    }
}