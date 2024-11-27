package com.sample;

public class ArrayToString {

    public static void main(String[] args) {
        int a[] = {1, 3, 43, 4, 43};
        System.out.println(arrToString(a));
    }

    public static String arrToString(int arr[]) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                s = s + arr[i] + "," ;
            } else s = s + arr[i];
        }
        return s;
    }
}
