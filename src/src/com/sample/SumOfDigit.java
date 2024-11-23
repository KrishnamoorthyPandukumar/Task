package com.sample;

public class SumOfDigit {

    public static void main(String[] args) {
        int value = 12345;
        int sum = 0;

        while (value > 0) {
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println(sum);
    }
}
