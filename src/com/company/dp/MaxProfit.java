package com.company.dp;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr1 = {7,1,5,3,6,4};
        int max = arr[arr.length-1];
        for (int i = arr.length-2 ; i >=0 ; i--) {
            int temp = arr[i];
            arr1[i] = max;
            max = Math.max(temp,max);

        }

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = Math.max(arr1[i]-arr[i],result);
        }
        System.out.println(result);
    }
}
