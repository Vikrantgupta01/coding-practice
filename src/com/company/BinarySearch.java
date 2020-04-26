package com.company;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 34, 45, 49 , 51, 57, 59, 66, 69, 72, 75, 78,85,92, 99};

        int  k = 34;
        System.out.println(getIndex(arr,0,arr.length,k));

    }

    public static int getIndex(int[] arr, int start, int end, int k){
        int mid = start + (end-start)/2;
        if(k >arr[mid]){
            getIndex(arr,mid,end,k);
        }else  if(k < arr[mid]) {
            getIndex(arr,start,mid,k);
        }else {
            return mid;
        }
        return 0;
    }
}
