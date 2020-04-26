package com.company.array.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MajorityElementMoore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m -> Integer.parseInt(m)).toArray();

            int count = 1;
            int ele = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if(ele == arr[j]){
                    count++;
                }else{
                    if(count==1){
                        ele = arr[j];
                    }else{
                        count--;
                    }
                }
            }

            count = 0       ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == ele){
                    count++;
                }
            }
            if(count > arrLength/2){
                System.out.println(ele);
            }else {
                System.out.println(-1);
            }

        }
    }
}
