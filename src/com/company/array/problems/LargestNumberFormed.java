package com.company.array.problems;

import java.util.Arrays;
import java.util.Collections;

public class LargestNumberFormed {

    public static void main(String[] args) {
        String str = "98 980";
        System.out.println("98098".compareTo("98980"));
        String[] arr = str.split(" ");
        Arrays.sort(arr,(s, t1) -> t1.compareTo(s) );
        for (String  s:arr) {
            System.out.print(s);

        }
    }
}
