package com.company.array.problems;

import java.util.Scanner;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < totalCases; i++) {
            int arrLength = Integer.parseInt(sc.nextLine());
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m -> Integer.parseInt(m)).toArray();
            int temp = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] - temp > 0 ){
                    System.out.println(temp-1);
                    break;
                }else {
                    temp++;
                }
            }
        }
    }
}
