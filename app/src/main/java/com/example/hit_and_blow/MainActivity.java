package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Intent intent = new Intent(MainActivity.this, NambaMain.class);
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}