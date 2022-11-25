package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;


public class NambaMain extends AppCompatActivity {
    public static int[] namba(int[] number, int[] input_number) {
        int[] judge = new int[2];

        int playNumber = 3; //桁数決め
        //hitの数の算出
        for (int i = 0; i < playNumber; i++) {
            if (number[i] == input_number[i]) {
                judge[0]++;
            }
        }
        //blowの数の算出
        for (int i = 0; i < playNumber; i++) {
            for (int k = 0; k < playNumber; k++) {
                if (number[i] == input_number[k]) {
                    judge[1]++;
                }
            }
        }

        judge[1] -= judge[0];//blow-hit

        return judge;
    }
}