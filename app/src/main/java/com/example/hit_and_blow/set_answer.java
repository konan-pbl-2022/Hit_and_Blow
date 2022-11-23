package com.example.hit_and_blow;

public class set_answer {
    static int[] setAnswer(int playNumber) {
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 配列の中身を並べ替え(シャッフル)
        for (int i = number.length - 1; i > 0; i--) {
            int r = (int) (Math.random() * (i + 1));
            int tmp = number[i];
            number[i] = number[r];
            number[r] = tmp;
        }
        //-------------------------------------------------
        //numberからplayNumber分配列要素をコピーする
        int[] answer = new int[playNumber];
        if (number[0] == 0) {
            System.arraycopy(number, 1, answer, 0, answer.length);
        } else {
            System.arraycopy(number, 0, answer, 0, answer.length);
        }
        return answer;
    }
}