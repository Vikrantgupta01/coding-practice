package com.uac;

import java.util.ArrayList;
import java.util.List;

public class TestUAC {


    public static void main(String[] args) {

        int[] arr1 = new int[]{7, 6, 9, 10};
        int[] arr2 = new int[]{9, 11, 10};
        int[] arr3 = new int[]{9, 4, 5, 10};
        List<Integer> result = findIntersection(arr1, arr2,arr3);
        for (Integer i : result
        ) {
            System.out.println(i);
        }
    }


    public static List<Integer> findIntersection(int[]... arr) {
        int[] arr1 = arr[0];
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int k = arr1[i];
            int matches = 0;
            for (int j = 1; j < arr.length; j++) {
                for (int l = 0; l < arr[j].length; l++) {
                    if (k == arr[j][l]) {
                        matches++;
                    }
                }
            }
            if (matches == arr.length - 1) {
                integers.add(k);
            }
        }

        return integers;
    }
}
