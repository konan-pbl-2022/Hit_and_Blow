package com.example.hit_and_blow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class input_numbers {
    @Override
    int digit = title.getDigit();
    /*
    int input_nums = new int[digit];
    Button ok = (Button) findviewById(R.Id.Button_delete);
    Button num_1 = (Button) findviewById(R.Id.1のボタンId);
    Button num_2 = (Button) findviewById(R.Id.2のボタンId);
    Button num_3 = (Button) findviewById(R.Id.3のボタンId);
    Button num_4 = (Button) findviewById(R.Id.4のボタンId);
    Button num_5 = (Button) findviewById(R.Id.5のボタンId);
    Button num_6 = (Button) findviewById(R.Id.6のボタンId);
    Button num_7 = (Button) findviewById(R.Id.7のボタンId);
    Button num_8 = (Button) findviewById(R.Id.8のボタンId);
    Button num_9 = (Button) findviewById(R.Id.9のボタンId);
    Button num_0 = (Button) findviewById(R.Id.0のボタンId);
    Button delete = (Button) findviewById(R.Id.Button_delete);
     */
    /*
    TextView seq0 = (TextView)findViewById(R.Id.text);
    TextView seq1 = (TextView)findViewById(R.Id.text);
    TextView seq2 = (TextView)findViewById(R.Id.text);
    /*
    if(digit>3){
        Button seq_3 = (Button)findviewById(R.Id.配列3のボタンId);
        TextView seq3 = (TextView)findViewById(R.Id.text);
    }
    if(digit>4){
        Button seq_4 = (Button)findviewById(R.Id.配列4のボタンId);
        TextView seq3 = (TextView)findViewById(R.Id.text);
    }
    */
    int change = 0;

    num_1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=1;
            change++;
            num_1.isEnabled=false;
        }
    });
    num_2.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            imput_nums[change]=2;
            change++;
            num2.isEnabled=false;
        }
    });
    num_3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=3;
            change++;
            num3.isEnabled=false;
        }
    });
    num_4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=4;
            change++;
            num4.isEnabled=false;
        }
    });
    num_5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=5;
            change++;
            num5.isEnabled=false;
        }
    });
    num_6.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=6;
            change++;
            num6.isEnabled=false;
        }
    });
    num_7.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=7;
            change++;
            num7.isEnabled=false;
        }
    });
    num_8.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=8;
            change++;
            num8.isEnabled=false;
        }
    });
    num_9.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=9;
            change++;
            num9.isEnabled=false;
        }
    });
    num_0.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            imput_nums[change]=0;
            change++;
            num0.isEnabled=false;
        }
    });

    if(change == digit){
        okButton.isEnabled=true;
    }

    public int get_input_nums(){
        return this.input_nums;
    }

}
