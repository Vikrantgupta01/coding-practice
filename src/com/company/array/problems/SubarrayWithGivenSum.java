package com.company.array.problems;

import java.util.Scanner;
import java.util.stream.Stream;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(sc.nextLine());


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
            int j = 0;
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
                if (total == sum) {
                    System.out.println(i + "   " + j);
                } else if (total > sum) {
                    total -= arr[j++];
                }
                if (total == sum) {
                    System.out.println(i + "   " + j);
                }
            }


        }
        return;
    }
}
