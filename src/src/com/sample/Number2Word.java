package com.sample;

public class Number2Word {

    public static void main(String[] args) {
     //   System.out.println(numToWord("123"));

        String s="1311";
        System.out.println(s.charAt(1));
    }

    public static String numToWord(String n) {

        String re = "";
        String[] numberWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        for (int i = 0; i < n.length(); i++) {
            re = re + numberWords[n.charAt(i) - '0'] + " ";
        }
        return re;
    }
}
