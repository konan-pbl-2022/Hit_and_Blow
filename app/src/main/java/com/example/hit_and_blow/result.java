package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Button retryButton = (Button)findViewById(R.id.button_retry);
        retryButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(result.this,game_level1.class);
                startActivity(intent);
            }
        });

        Button titleButton = (Button)findViewById(R.id.button_title);
        titleButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(result.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}