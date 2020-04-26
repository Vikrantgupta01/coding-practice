package com.company.array.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountTheTriplets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            String[] strarr = sc.nextLine().split(" ");
            int[] arr  = new int[strarr.length];
            for (int J = 0; J < strarr.length ; J++) {
                arr[J] = Integer.parseInt(strarr[J]);
            }
            Arrays.sort(arr);
            int count = 0;
            for (int j = 2; j < arrLength ; j++) {
                int myNum = arr[j];
                int left = 0;
                int right = j-1;

                while (left<right){

                    if(myNum - arr[right] > arr[left]){
                        left++;
                    }else if(myNum - arr[right] < arr[left]){
                        right--;
                    }else if(myNum - arr[right] == arr[left]){
                        count++;
                        left++;
                        right--;
                    }
                }
            }

            if(count==0){
                System.out.println(-1);
            }else{
                System.out.println(count);
            }
        }
    }
}
