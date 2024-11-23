package com.sample;

public class CharIncrement {

    public static void main(String[] args) {
        String name = "ab cz";
        String finalName = "";
        int i = 0;
        while (i < name.length()) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
                if (name.charAt(i) == 'A' || name.charAt(i) == 'a') {
                    finalName = finalName + (char) (name.charAt(i) + 25);
                } else if (name.charAt(i) == 'z' || name.charAt(i) == 'Z') {
                    finalName = finalName + (char) (name.charAt(i) - 25);
                } else {
                    finalName = finalName + (char) (name.charAt(i) + 1);
                }
            } else {
                finalName = finalName + name.charAt(i);
            }
            i++;
        }
        System.out.println(finalName);
    }
}
