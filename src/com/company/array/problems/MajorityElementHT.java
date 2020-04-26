package com.company.array.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class MajorityElementHT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m->Integer.parseInt(m)).toArray();
            HashMap<String,Integer> integerIntegerHashMap = new HashMap<>();
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
               Integer count =  integerIntegerHashMap.get(arr[j]+"");
               if(count==null){
                   count =0 ;
               }
                ++count;
               if(count>arrLength/2){
                   found =true;
                   System.out.println(arr[j]);
                   break;
               }
                integerIntegerHashMap.put(arr[j]+"",count);
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}
