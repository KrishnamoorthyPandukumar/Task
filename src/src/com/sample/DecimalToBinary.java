package com.sample;

public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 255;
        int mf = 1;
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 2 * mf;
            mf = mf * 10;
            n = n / 2;
        }
        System.out.println(sum);
        //other way
       /* StringBuilder s = new StringBuilder();
        while(n>0){
            s.insert(0,n%2);
            n=n/2;
        }
        System.out.println(s);*/
    }
}
