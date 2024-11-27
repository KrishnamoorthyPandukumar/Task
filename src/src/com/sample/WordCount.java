package com.sample;

public class WordCount {

    public static void main(String[] args) {

        System.out.println(word("he is friend leis is a friend", "is"));
    }

    public static int word(String n, String find) {
        int i = 0;
        String[] c = n.split("\\s+");
        int word = 0;
        while (i < c.length) {
            System.out.println(c[i]);
            if (c[i].equalsIgnoreCase(find)) {
                word++;
            }
            i++;
        }
        return word;
    }
}
