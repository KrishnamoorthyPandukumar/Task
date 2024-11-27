package com.sample;

public class FindNthPrimeNumber {
    public static void main(String[] args) {
        System.out.println(nthPrime(10));
    }
    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int a) {
        int pc = 0;
        int k = 1;
        while (pc < a) {
            k++;
            if (isPrime(k)) {
                pc++;
            }
        }
        return k;
    }
}
