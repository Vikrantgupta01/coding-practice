package com.company.array.problems;

import java.util.Scanner;
import java.util.stream.Stream;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases  = Integer.parseInt(sc.nextLine());


        for (int k = 0; k < noOfTestCases; k++) {
            String input = sc.nextLine();
            int[] input1 = Stream.of(input.split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();
            int sum = input1[1];
            String numbers = sc.nextLine();
            int[] arr = Stream.of(numbers.split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();
            boolean found = false ;

            for(int i =0 ; i < arr.length ; i++){
                int  total = 0;

                for (int j = i; j < arr.length; j++) {
                    total += arr[j];
                    if(total > sum){
                        break;
                    }
                    if(total == sum){
                        System.out.println((i+1) + " "+(j+1));
                        found = true;
                        break;
                    }
                }
                if(found)
                    break;

            }
            if(!found){
                System.out.println(-1);
            }

        }
        return;
    }
}
