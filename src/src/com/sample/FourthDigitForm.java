package com.sample;

public class FourthDigitForm {
    public static void main(String[] args) {
        System.out.println(fourDigLeft("132323",4));
    }

    public  static  int fourDigLeft(String n,int v){
        int i=0;
        int find=0;
        while(i<v){
            find=Character.getNumericValue(n.charAt(i));
            i++;
        }
        return find;
    }
}
