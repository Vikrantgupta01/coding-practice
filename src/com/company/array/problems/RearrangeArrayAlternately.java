package com.company.array.problems;

public class RearrangeArrayAlternately {

    public static void main(String[] args) {
        int[] arr = { 1 , 2 ,3 ,4 ,5 ,6} ;

        for (int i = 0; i < arr.length ; i++) {
            doSomething(arr, i , arr.length-1);
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
    static void doSomething(int[] arr , int left, int right){
        int mid = left+  (right -left)/2;
        for (int i = left; i <= mid; i++, right--) {
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
        }
    }
}
