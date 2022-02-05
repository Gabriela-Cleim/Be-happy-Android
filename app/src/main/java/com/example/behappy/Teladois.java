package com.example.behappy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teladois extends AppCompatActivity {

    Button bt_show;
    Button bt_chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladois);

        bt_show=findViewById(R.id.bt_show);

        bt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Telaquatro=new Intent(view.getContext(), Telaquatro.class);
                startActivity(Telaquatro);
            }
        });

        bt_chat=findViewById(R.id.bt_chat);

        bt_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatbot=new Intent(view.getContext(), chatbot.class);
                startActivity(chatbot);
            }
        });
    }

}