package com.sample;

public class JuliantDate {
    public static void main(String[] args) {
        System.out.println(JuliantDay(12,31));
    }

    public static int JuliantDay(int month,int day){
        return (month-1)*30+day;
    }
}
bh  aky