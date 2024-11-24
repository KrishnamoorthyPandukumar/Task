package com.sample;

public class ReturnBiggest {
    public static void main(String[] args) {
        System.out.println(retBig(10, 12, 18, 100));
    }
    public static int retBig(int a, int b, int c, int d) {
        if (a > b && a > c & a > d) return a;
        else if (b > c & b > d & b > a) return b;
        else if (c > d && c > a && c > b) return c;
        else return d;
    }
}
