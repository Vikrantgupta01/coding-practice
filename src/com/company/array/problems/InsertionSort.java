package com.company.array.problems;

public class InsertionSort {

    public static void main(String[] args) {
        int arr1[] = {2,10,9,1,4,7,5};

        for (int i = 1; i < arr1.length; i++) {
            int temp = arr1[i];
            for (int j = i; j >0; j--) {
                if(temp < arr1[j-1]){
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
    }
}
