package com.sample;

import java.util.Arrays;

public class FindDuplicate {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 2, 2, 3};
        System.out.println(Arrays.toString(dup(a)));
    }

    public static int[] dup(int a[]) {
        int dup[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int index = 0;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (a[i] == a[j]) {
                        dup[index++] = a[j];
                    }
                }
            }
        }
        return dup;

    }
}
