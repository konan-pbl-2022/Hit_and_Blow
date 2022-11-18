package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class input {
    int change = 0;
    int[] input_nums = new int[3];
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level1);


        final Button ok = (Button) findviewById(R.Id.button_ok);
        final Button num_1 = (Button) findviewById(R.Id.button1);
        final Button num_2 = (Button) findviewById(R.Id.button2);
        final Button num_3 = (Button) findviewById(R.Id.button3);
        final Button num_4 = (Button) findviewById(R.Id.button4);
        final Button num_5 = (Button) findviewById(R.Id.button5);
        final Button num_6 = (Button) findviewById(R.Id.button6);
        final Button num_7 = (Button) findviewById(R.Id.button7);
        final Button num_8 = (Button) findviewById(R.Id.button8);
        final Button num_9 = (Button) findviewById(R.Id.button9);
        final Button num_0 = (Button) findviewById(R.Id.button0);
        final Button delete = (Button) findviewById(R.Id.button_delete);
        TextView seq_0 = (TextView) findViewById(R.Id.number_1);
        TextView seq_1 = (TextView) findViewById(R.Id.number_2);
        TextView seq_2 = (TextView) findViewById(R.Id.number_3);
        ok.isEnabled = false;
        num_0.isEnabled = false;

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 1;
                change++;
                num_1.isEnabled = false;
            }
        });
        num_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input_nums[change] = 2;
                change++;
                num_2.isEnabled = false;
            }
        });
        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 3;
                change++;
                num_3.isEnabled = false;
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 4;
                change++;
                num_4.isEnabled = false;
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 5;
                change++;
                num_5.isEnabled = false;
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 6;
                change++;
                num_6.isEnabled = false;
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 7;
                change++;
                num_7.isEnabled = false;
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 8;
                change++;
                num_8.isEnabled = false;
            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 9;
                change++;
                num_9.isEnabled = false;
            }
        });
        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 0;
                change++;
                num_0.isEnabled = false;
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change = 0;
                input_nums=new int[3];
                num_0.isEnabled = false;
                num_1.isEnabled = true;
                num_2.isEnabled = true;
                num_3.isEnabled = true;
                num_4.isEnabled = true;
                num_5.isEnabled = true;
                num_6.isEnabled = true;
                num_7.isEnabled = true;
                num_8.isEnabled = true;
                num_9.isEnabled = true;

                ok.isEnabled = false;
            }
        });

        seq_0.setText(imput_nums[0]);
        seq_1.setText(imput_nums[1]);
        seq_2.setText(imput_nums[2]);

        if(change == 1){
            num_0.isEnabled = true;
        }

        if (change == digit) {
            ok.isEnabled = true;
        }

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_0.isEnabled = false;
                num_1.isEnabled = false;
                num_2.isEnabled = false;
                num_3.isEnabled = false;
                num_4.isEnabled = false;
                num_5.isEnabled = false;
                num_6.isEnabled = false;
                num_7.isEnabled = false;
                num_8.isEnabled = false;
                num_9.isEnabled = false;
                ok.isEnabled = false;
                return;
            }
        });


    }

    public int[] get_imput_nums(){
        return this.input_nums;
    }
}
