package com.sample;

public class FindSecondLargestNumber {


    public static void main(String[] args) {
        int myArr[] = {1, 34, 53, 44, 33, 45, 4, 42, 43};
        System.out.println(secondLargest(myArr));
    }

    public static int secondLargest(int arr[]) {
        int first = arr[0];
        int second = 0;

        for (int i = 1; i < arr.length; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            } else if (second < arr[i]) {
                second = arr[i];
            }
        }
        return second;
    }

}
