package com.sample;

public class SumOfSeries {

    public static void main(String[] args) {
        int f = 1;
        int i = 1;
        int sum = 1;
        int x = 10;
        while (i <= 7) {
            f = fact(i);
            sum = sum + (x - i) / f;
            i++;
        }
        System.out.println(sum);
    }

    public static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }
}
