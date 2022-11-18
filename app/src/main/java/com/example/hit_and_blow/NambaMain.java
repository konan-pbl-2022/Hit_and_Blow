package com.example.hit_and_blow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import android.content.Intent;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class NambaMain extends AppCompatActivity{
    public static void main(String[] args) {

    ////乱数字の配列（number）作成
    //配列を作成
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
    int playNumber = 4; //桁数決め////
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
    // テスト用に答えをコンソールに表示(ゲーム時は削除)
    for(int a=0 ;a<answer.length;a++) {
        System.out.print(a + "\t");
    }
    //改行
    System.out.println();
        //hit blow count の初期化
        int hit = 0;
        int blow = 0;
        int count = 0;
        int maxPlay =5; //プレイ回数
        int b[];
        int n=0;
        int d=1;
        boolean gameFlag = false;
        //-------------------------------------------------
        //数字が一致（hit=playNumber）またはcountが任意の数値になるまで繰り返す
        while (!gameFlag) {
            hit = 0;
            blow = 0;
            int[] userNumArray = new int[playNumber];
            //入力チェック用変数 validCheck
            boolean validCheck = false;
            while (!validCheck) { // 入力チェック開始
                try {
                    //任意の数字をコンソールより取得
                    //BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
                    int[] inNum = new int[playNumber];

                    //受け取った値をbへ代入
                    //String b = a.readLine();

                    b=input.get_input_nums();
                    //受け取った数値をnへ代入

                    for(int i=2; i>=0; i--){
                        n+=b[i]*d;
                        d*=10;
                    }

                    //受け取った値の最初の1文字をstrへ代入
                    //String zeroCheck = b.substring(0, 1);
                    //桁数をdigitsへ代入
                    int digits = Integer.toString(n).length();

                    //-------------------------------------------------
                    //取得した整数を配列化するBeArrayメソッドを実行
                    beArray(inNum, n);
                    //-------------------------------------------------
                    //受け取った値の桁数をdigitsへ代入
                    digits = Integer.toString(n).length();

                    //if (zeroCheck.equals("0")) {
                    //    System.out.println(digits + ":" + playNumber);
                    //    System.out.println("先頭の数字に0は入力できません。");
                    //} else if (digits != playNumber) {
                    //    if (digits < playNumber || n < Math.pow(10, playNumber - 1)) { //桁チェック
                    //        System.out.println(digits);
                    //        System.out.println("桁が少ないです、" + playNumber + "桁の数字を入力し直してください");
                    //    } else if (digits > playNumber) {
                    //        System.out.println("桁が多すぎます、" + playNumber + "桁の数字を入力してください");
                    //    }
                    //} else if (duplicateCheck(inNum)) { //同じ数字が使われていたら
                    //    System.out.println("同じ数字が使われています");
                    //} else { //異常がなければ
                    //    validCheck = true;
                    //    userNumArray = inNum;
                    //}
                } catch (IOException e) {
                    System.out.println(e);
                } catch (NumberFormatException o) {
                    System.out.println("数字以外のものが入力されています");
                } catch (ArrayIndexOutOfBoundsException f) {
                    System.out.println(f);
                }
            }
            //------------------入力チェック終了-------------------------------

            //----------hit, blowの数算出開始--------------------
            //hitの数を算出
            for (int i = 0; i < playNumber; i++) {
                if (answer[i] == userNumArray[i]) {
                    hit++;
                }
            }
            //blowの数の算出
            for (int i = 0; i < playNumber; i++) {
                for (int k = 0; k < playNumber; k++) {
                    if (answer[i] == userNumArray[k]) {
                        blow++;
                    }
                }
            }
            //-------------------hit and blow 算出終了------------------------------

            if (hit == playNumber) { //もしhit==playNumberなら
                System.out.println("正解です");
                System.out.println("入力回数は" + count + "です");
                gameFlag = true;
            } else{//hit4でなければhit & blowの数値を返す
                System.out.println(hit + "Hit " + (blow - hit) + "Blow");
                //入力回数カウント
                count++;
            }
            //-------------------------------------------------

            if (count == maxPlay) {
                System.out.println("入力回数が" + maxPlay +"回になりました。ゲームオーバー");
                gameFlag = true;
            }
            //-------------------------------------------------

        } //数字が一致（hit=playNumber）まで繰り返すの終了地点
    }

    //文字重複チェックメソッド
    public static boolean duplicateCheck(int[] inNum) {
        int duplicate = 0;
        for (int i = 0; i < inNum.length; i++) {
            for (int k = 0; k < inNum.length; k++) {
                if (k != i && inNum[k] == inNum[i]) {
                    duplicate++;
                }
            }
        }
        if (duplicate >= 2) {
            return true;
        }
        return false;
    }

    // beArrayメソッド
    //配列inNumへ入力された値を１つずつ配列へ格納する
    //paramater
    // inNum 入力をいれる配列
    // n 入力された値

    public static void beArray(int[] inNum, int n) {

        for (int j = inNum.length - 1; j >= 0; j--) {
            int d = n / 10;
            int k = n - d * 10;
            n = d;
            inNum[j] = k;
        }
    }
}