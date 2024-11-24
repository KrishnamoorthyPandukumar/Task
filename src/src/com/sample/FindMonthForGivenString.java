package com.sample;

public class FindMonthForGivenString {
    public static void main(String[] args) {

        String date = "1999-10-31";
        String s[]= date.split("-");
        System.out.println(s[1]);
    }
}