package com.sample;

import java.util.Arrays;

public class RemoveSpaceAndFindAverage {

    public static void main(String[] args) throws Exception {
        String s = "13 434 ! 4.33".replaceAll("[^0-9.]", " ");
        String s1[] = s.split(" ");
        double sum = 0;
        double count = 0;
        System.out.println(Arrays.asList(s1));
        for (int i = 0; i < s1.length; i++) {
            if (!s1[i].isEmpty()) {
                count++;
                sum += Double.parseDouble(s1[i]);
            }
        }
        System.out.println(sum/count);
    }
}
