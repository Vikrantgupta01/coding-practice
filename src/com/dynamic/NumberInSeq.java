package com.dynamic;

public class NumberInSeq {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(new NumberInSeq().checkIfNumberInSequence(arr,1, arr.length-2));
    }


    public boolean checkIfNumberInSequence( int[] arr, int i, int j){

        return i>j || (   (arr[i] - arr[i-1]==1) && (arr[j+1] - arr[j]==1) && checkIfNumberInSequence(arr,i+1,j-1));
    }
}
