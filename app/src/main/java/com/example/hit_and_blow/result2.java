package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        Intent intent =getIntent();
        String answer = intent.getStringExtra("ANS");

        TextView viewTime = (TextView) findViewById(R.id.answer);
        viewTime.setText("答えは"+answer+"でした…");

        Button retry2Button = (Button)findViewById(R.id.button_retry2);
        retry2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(result2.this,game_level1.class);
                startActivity(intent);
            }
        });

        Button title2Button = (Button)findViewById(R.id.button_title2);
        title2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(result2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}