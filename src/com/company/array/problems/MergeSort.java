package com.company.array.problems;

public class MergeSort {

    public static void main(String[] args) {


        int[] arr = {38,    27,43,    3,9,    82,10};

        sort(arr,0,6);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }

    }

    public static void finalSort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    public static void sort(int[] arr, int left, int right){
        if(left<right){
            int m = (left+right)/2;
            sort(arr,left,m);
            sort(arr,m+1,right);
            merge(arr,left,m,right);
        }
    }
    public static void merge(int[] arr, int left, int middle, int right){

        int n1 = middle-left+1;
        int n2 = right-middle;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];


        // copy element
        for (int i = 0; i <n1; ++i) {
            leftArr[i] = arr[left+i];
        }

        for (int i = 0; i < n2; ++i) {
            rightArr[i] = arr[middle+1+i];
        }

        int l =0;
        int r = 0;

        while (l< (n1) && r<(n2)){
            if(leftArr[l] > rightArr[r]){
                arr[left] = rightArr[r];
                r++;
            }else{
                arr[left] = leftArr[l];
                l++;
            }
            left++;
        }


        while (l< (n1)){
            arr[left] = leftArr[l];
            l++;
            left++;
        }
        while (r<(n2)){
            arr[left] = rightArr[r];
            r++;
            left++;
        }

    }
}
