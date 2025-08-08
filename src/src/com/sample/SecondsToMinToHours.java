package com.sample;

public class SecondsToMinToHours {
    public static void main(String[] args) {
        int h, m, s;
        s = 200;
        h = s / 3600;
        s = s - h * 3600;
        m = s / 60;
        s = s - m * 60;

        float f=(22f/7)*5;
        System.out.println(f);
        System.out.println(h + " " + m + " " + s + " ");

    }

}
