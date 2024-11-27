package com.sample;

import java.util.Arrays;

public class Spilit2Arr {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrIn("24=343=43")));
    }

    public static int[] arrIn(String n) {
        String v[] = n.split("=");
        int a[] = new int[v.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(v[i]);
        }
        return a;
    }
}
