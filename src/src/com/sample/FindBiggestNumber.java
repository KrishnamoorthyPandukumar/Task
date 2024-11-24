package com.sample;

public class FindBiggestNumber {
    public static void main(String[] args) {
        int num[] = {9, 2, 5, 19, 9};
        int big = num[0];
        for (int i = 1; i < num.length; i++) {
            if (big < num[i]) {
                big = num[i];
            }
        }
        System.out.println(big);
    }

}
