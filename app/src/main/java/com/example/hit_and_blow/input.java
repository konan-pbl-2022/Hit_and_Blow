package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

public class input extends AppCompatActivity {
    int change = 0;
    int[] input_num = new int[3];

    public int clicked_num(int num) {
        input_num[change] = num;
        change++;
        return change;
    }

    public void delete() {
        change = 0;
        input_num = new int[3];
    }

    public int get_change(){
        return change;
    }

    public int[] get_imput_nums() {
        return input_num;
    }
}