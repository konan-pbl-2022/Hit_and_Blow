package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class game_level1 extends AppCompatActivity {

    int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    /* 配列の中身を並べ替え(シャッフル) */
    for(int i = number.length - 1; i > 0; i--) {
        int r = (int) (Math.random() * (i + 1));
        int tmp = number[i];
        number[i] = number[r];
        number[r] = tmp;
    }
    //-------------------------------------------------
    //numberからplayNumber分配列要素をコピーする
    int playNumber = 3; //桁数決め////
    int[] answer = new int[playNumber];
    if(number[0] == 0) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = number[i + 1];
        }
    } else {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = number[i];
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level1);
    }
}