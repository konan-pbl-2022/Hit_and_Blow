package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class game_level1 extends AppCompatActivity {
    int times = 0;
    final int playNumber = 3; //桁数決め////
    final int max_times = 11; //最大回数
    TextView[] log = new TextView[10];
    Button[] num = new Button[10];
    int[][] history = new int[max_times][playNumber];
    int check = 0;
    int[] input_nums = new int[playNumber];
    int[][] hit_blow = new int[max_times][2];
    input Input = new input();
    int[] answer = new int[playNumber];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level1);

        log[0] = findViewById(R.id.log1);
        log[1] = findViewById(R.id.log2);
        log[2] = findViewById(R.id.log3);
        log[3] = findViewById(R.id.log4);
        log[4] = findViewById(R.id.log5);
        log[5] = findViewById(R.id.log6);
        log[6] = findViewById(R.id.log7);
        log[7] = findViewById(R.id.log8);
        log[8] = findViewById(R.id.log9);
        log[9] = findViewById(R.id.log10);
        final Button ok = (Button) findViewById(R.id.button_ok);
        num[1] = findViewById(R.id.button1);
        num[2] = findViewById(R.id.button2);
        num[3] = findViewById(R.id.button3);
        num[4] =findViewById(R.id.button4);
        num[5] =findViewById(R.id.button5);
        num[6] =findViewById(R.id.button6);
        num[7] =findViewById(R.id.button7);
        num[8] =findViewById(R.id.button8);
        num[9] =findViewById(R.id.button9);
        num[0] =findViewById(R.id.button0);
        Button delete = (Button) findViewById(R.id.button_delete);
        final TextView seq_0 = (TextView) findViewById(R.id.number_1);
        final TextView seq_1 = (TextView) findViewById(R.id.number_2);
        final TextView seq_2 = (TextView) findViewById(R.id.number_3);
        ok.setEnabled(false);
        num[0].setEnabled(false);
        answer = set_answer.setAnswer(playNumber);


        num[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(1);
                num[1].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });

        num[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(2);
                num[2].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(3);
                num[3].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(4);
                num[4].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(5);
                num[5].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(6);
                num[6].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(7);
                num[7].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(8);
                num[8].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(9);
                num[9].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });
        num[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = Input.clicked_num(0);
                num[0].setEnabled(false);
                check_digit(ok);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.delete();
                num[0].setEnabled(false);
                num[1].setEnabled(true);
                num[2].setEnabled(true);
                num[3].setEnabled(true);
                num[4].setEnabled(true);
                num[5].setEnabled(true);
                num[6].setEnabled(true);
                num[7].setEnabled(true);
                num[8].setEnabled(true);
                num[9].setEnabled(true);
                ok.setEnabled(false);
                input_nums = Input.get_imput_nums();
                display(seq_0, seq_1, seq_2, input_nums);
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num[0].setEnabled(false);
                num[1].setEnabled(true);
                num[2].setEnabled(true);
                num[3].setEnabled(true);
                num[4].setEnabled(true);
                num[5].setEnabled(true);
                num[6].setEnabled(true);
                num[7].setEnabled(true);
                num[8].setEnabled(true);
                num[9].setEnabled(true);
                ok.setEnabled(false);
                history[times] = Input.get_imput_nums();
                NambaMain HaB =  new NambaMain();
                HaB.namba(answer,history[times]);
                hit_blow[times][0] = HaB.hit;
                hit_blow[times][1] = HaB.blow;
                if (hit_blow[times][0] == 3) {
                    Intent intent = new Intent(game_level1.this, result.class);
                    startActivity(intent);
                }
                Input.delete();
                if (times < 10) {
                    display_history();
                } else {
                    Intent intent2 = new Intent(game_level1.this, result2.class);
                    startActivity(intent2);
                }

                times++;

            }
        });

    }

    void display_history() {
        String text = String.valueOf(input_nums[0]) + String.valueOf(input_nums[1]) + String.valueOf(input_nums[2]) + "   " + String.valueOf(hit_blow[times][0]) + "hit   " + String.valueOf(hit_blow[times][1]) + "blow";
        log[times].setText(text);
    }

    void display(TextView seq_0, TextView seq_1, TextView seq_2, int[] input_nums) {
        seq_0.setText(String.valueOf(input_nums[0]));
        seq_1.setText(String.valueOf(input_nums[1]));
        seq_2.setText(String.valueOf(input_nums[2]));
    }

    void check_digit(Button ok) {
        if (check == 1) {
            num[0].setEnabled(true);
        } else if (check == 3) {
            num[0].setEnabled(false);
            num[1].setEnabled(false);
            num[2].setEnabled(false);
            num[3].setEnabled(false);
            num[4].setEnabled(false);
            num[5].setEnabled(false);
            num[6].setEnabled(false);
            num[7].setEnabled(false);
            num[8].setEnabled(false);
            num[9].setEnabled(false);
            ok.setEnabled(true);
        }
    }
}
