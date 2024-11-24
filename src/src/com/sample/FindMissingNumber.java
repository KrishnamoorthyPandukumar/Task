package com.sample;

public class FindMissingNumber {

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 0, 1};

        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println(a[i]);
        }
    }
}
