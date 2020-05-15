package com.company.recurrsion.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        System.out.println(49/10);
        System.out.println(49%10);

       /* Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int z = 0; z < totalCases; z++) {
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m->Integer.parseInt(m)).toArray();
        }*/
       int i = 493;
       Stack<Integer> list = new Stack<>();
       while (i>0){
           list.push(i%10);
           i = i/10;
       }
        System.out.println(list);

    }
}
