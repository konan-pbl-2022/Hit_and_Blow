package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button level1Button = (Button)findViewById(R.id.level1);
        level1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,game_level1.class);
                startActivity(intent);
            }
        });

        Button explanationButton = (Button)findViewById(R.id.button_explanation);
        explanationButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,explanation.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}