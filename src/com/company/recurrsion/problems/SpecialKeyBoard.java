package com.company.recurrsion.problems;

import java.util.Scanner;

public class SpecialKeyBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfTestCases = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < noOfTestCases; k++) {

            int keyStrokeNumber = Integer.parseInt(sc.nextLine());
            int i = keyStrokeNumber - 3;
            int j = i / 3;
            int m = i % 3;
            int total = 3;
            int temp = 0;
            while (j-- > 1) {
                temp = total;
                total += total;
            }
            m=3;
            while (m-- > 0) {
                total += temp;
            }

            System.out.println(total);
        }
    }

}
