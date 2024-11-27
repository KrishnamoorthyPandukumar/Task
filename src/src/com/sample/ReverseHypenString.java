package com.sample;

public class ReverseHypenString {
    public static void main(String[] args) {
        System.out.println(reverse("Krishna"));
    }
    public  static String reverse(String n){

        int i=1;
        String rev="";

        while(n.length()>=i){
            rev=rev + n.charAt(n.length()-i)+"-";
            i++;
        }
        return rev;
    }
}
