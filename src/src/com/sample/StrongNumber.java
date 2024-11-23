package com.sample;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum + fact(temp % 10);
            temp = temp / 10;
        }
        if (sum == n) System.out.println("true");
        else System.out.println("false");

    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
