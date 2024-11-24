package com.sample;

public class UnityNumber {

    public static void main(String[] args) {
        int n = 12345;
        int sum = Sum(n);
        while (sum > 9) {
            sum = Sum(sum);
        }
        System.out.println(sum);
    }

    public static int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
