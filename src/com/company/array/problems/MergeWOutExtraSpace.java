package com.company.array.problems;

public class MergeWOutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] = {2, 3, 8, 13, 19};
        for (int k = arr2.length-1; k >=0 ; k--) {
            int last = arr1[arr1.length-1];
            int l;

            for (l = arr1.length-2; l >=0  && arr2[k] < arr1[l] ; l--) {
                arr1[l+1] =  arr1[l];
            }
            if(l != arr1.length-2 || last > arr2[k]){
                arr1[l+1] = arr2[k];
                arr2[k] = last;
            }

        }

        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + " ");
        }
        System.out.println("");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }

    }
}
