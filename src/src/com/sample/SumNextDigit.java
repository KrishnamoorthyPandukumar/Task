package com.sample;

public class SumNextDigit {
    public static void main(String[] args) {
        int n = 38754;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum=sum+n%10;
            n=n/100;
        }

/*         String n = "38754";
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(n.charAt(i));
                sum = sum+(n.charAt(i) -'0);
            }
        }*/
        System.out.println(sum);
    }
}
