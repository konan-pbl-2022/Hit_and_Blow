package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent =getIntent();
        String cleartime = intent.getStringExtra("TIME");


        TextView viewTime = (TextView) findViewById(R.id.clear_time);
        viewTime.setText(cleartime+"秒");

        Button retryButton = (Button)findViewById(R.id.button_retry);
        retryButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent2 = new Intent(result.this,game_level1.class);
                startActivity(intent2);
            }
        });

        Button titleButton = (Button)findViewById(R.id.button_title);
        titleButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent2 = new Intent(result.this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}