package com.sample;

public class FloydTriangle {

    public static void main(String[] args) {

        int n = 7;
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(++s + " ");
            }
            System.out.println();
        }
    }
}
