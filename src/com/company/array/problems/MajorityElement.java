package com.company.array.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m->Integer.parseInt(m)).toArray();
            Arrays.sort(arr);

            int prev = -1;
            int count = 0;
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if(prev  != arr[j]){
                    count =1;
                    prev = arr[j];

                }else{
                    count++;
                    if(count>arr.length/2){
                        System.out.println(prev);
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}
