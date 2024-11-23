package com.sample;

import java.util.Arrays;

public class CapsSmall {
    public static void main(String[] args) {
        String s = "Ramu 100 scored";
        String s1 = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                k++;
                if (k % 2 == 1) {
                    s1 = s1 + String.valueOf(s.charAt(i)).toUpperCase();
                } else {
                    s1 = s1 + String.valueOf(s.charAt(i)).toLowerCase();
                }
            } else s1 = s1 + s.charAt(i);

        }
        System.out.println(s1);
    }
}

