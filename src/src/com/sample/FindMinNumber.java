package com.sample;

public class FindMinNumber {
    public static void main(String[] args) {
        int num[]={11,13,232,1};
        int min=num[0];

        for(int i=1;i<num.length;i++){
            if(min>num[i])
            {
                min=num[i];
            }
        }
        System.out.println(min);
    }
}
