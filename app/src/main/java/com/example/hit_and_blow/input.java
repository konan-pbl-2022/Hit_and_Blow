package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class input extends AppCompatActivity {
    int change = 0;
    int[] input_nums = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level1);


        final Button ok = (Button) findViewById(R.id.button_ok);
        final Button num_1 = (Button) findViewById(R.id.button1);
        final Button num_2 = (Button) findViewById(R.id.button2);
        final Button num_3 = (Button) findViewById(R.id.button3);
        final Button num_4 = (Button) findViewById(R.id.button4);
        final Button num_5 = (Button) findViewById(R.id.button5);
        final Button num_6 = (Button) findViewById(R.id.button6);
        final Button num_7 = (Button) findViewById(R.id.button7);
        final Button num_8 = (Button) findViewById(R.id.button8);
        final Button num_9 = (Button) findViewById(R.id.button9);
        final Button num_0 = (Button) findViewById(R.id.button0);
        final Button delete = (Button) findViewById(R.id.button_delete);
        TextView seq_0 = (TextView) findViewById(R.id.number_1);
        TextView seq_1 = (TextView) findViewById(R.id.number_2);
        TextView seq_2 = (TextView) findViewById(R.id.number_3);
        ok.setEnabled(false);
        num_0.setEnabled(false);
        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 1;
                change++;
                num_1.setEnabled(false);
            }
        });
        num_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                input_nums[change] = 2;
                change++;
                num_2.setEnabled(false);
            }
        });
        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 3;
                change++;
                num_3.setEnabled(false);
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 4;
                change++;
                num_4.setEnabled(false);
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 5;
                change++;
                num_5.setEnabled(false);
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 6;
                change++;
                num_6.setEnabled(false);
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 7;
                change++;
                num_7.setEnabled(false);
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 8;
                change++;
                num_8.setEnabled(false);
            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 9;
                change++;
                num_9.setEnabled(false);
            }
        });
        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_nums[change] = 0;
                change++;
                num_0.setEnabled(false);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change = 0;
                input_nums = new int[3];
                num_0.setEnabled(false);
                num_1.setEnabled(true);
                num_2.setEnabled(true);
                num_3.setEnabled(true);
                num_4.setEnabled(true);
                num_5.setEnabled(true);
                num_6.setEnabled(true);
                num_7.setEnabled(true);
                num_8.setEnabled(true);
                num_9.setEnabled(true);
                ok.setEnabled(false);
            }
        });

        seq_0.setText(input_nums[0]);
        seq_1.setText(input_nums[1]);
        seq_2.setText(input_nums[2]);

        if (change == 1) {
            num_0.setEnabled(true);
        }

        if (change == 3) {
            ok.setEnabled(true);
        }

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_0.setEnabled(false);
                num_1.setEnabled(false);
                num_2.setEnabled(false);
                num_3.setEnabled(false);
                num_4.setEnabled(false);
                num_5.setEnabled(false);
                num_6.setEnabled(false);
                num_7.setEnabled(false);
                num_8.setEnabled(false);
                num_9.setEnabled(false);
                ok.setEnabled(false);
                return;
            }
        });

    }

    public int[] get_imput_nums () {
        return this.input_nums;
    }
}