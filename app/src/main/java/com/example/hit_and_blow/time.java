package com.example.hit_and_blow;

public class time {
    long diffTime;
    long startTime;
    long endTime;
    String str;

    void start(){
        startTime = System.currentTimeMillis();
        startTime = startTime / 1000 ;
    }

    void end(){
        endTime = System.currentTimeMillis();
        endTime = endTime / 1000;
        diffTime=endTime-startTime;
        diffTime=(int)diffTime;
        str=String.valueOf(diffTime);
    }

    String getDiffTime(){
        return str;
    }

}
