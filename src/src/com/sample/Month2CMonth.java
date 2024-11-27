package com.sample;

public class Month2CMonth {

    public static void main(String[] args) {
        System.out.println(month2C(0, 0));
    }

    public static String month2C(int i, int j) {

        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (j == 0) {
            return months[i];
        } else if (j == 1) {
            return months[i].substring(0, 3);
        }
        return "";
    }
}
