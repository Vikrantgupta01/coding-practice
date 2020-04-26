package com.company;

public class BinarySearchShifted {

    public static void main(String[] args) {
        int[] arr = { 75, 78,85,92, 99 , 1, 4, 7, 34, 45, 49 , 51, 57, 59, 66, 69, 72};

        int  k = 85;
        System.out.println(getIndex(arr,0,arr.length-1,k));

    }

    public static int getIndex(int[] arr, int start, int end, int k){
        int mid = start + (end-start)/2;
        if(k >arr[mid] && k < arr[end ]){
            getIndex(arr,mid,end,k);
        }else  if(k < arr[mid] || k> arr[end]) {
            getIndex(arr,start,mid,k);
        }else {
            return mid;
        }
        return 0;
    }
}
