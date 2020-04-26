package com.company.array.problems;

import java.util.Scanner;
import java.util.stream.Stream;

public class Kadane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m -> Integer.parseInt(m)).toArray();
            int total = arr[0];
            int highestSum =arr[0];
            for (int j = 1; j < arrLength; j++) {
                int temp = total + arr[j] ;
                if(temp > arr[j] ){
                    total = temp;
                }else{
                    total = arr[j];
                }

                if(total>highestSum){
                    highestSum = total;
                }
            }
            System.out.println(highestSum);
        }


    }
}
