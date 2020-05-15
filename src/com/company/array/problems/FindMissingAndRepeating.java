package com.company.array.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindMissingAndRepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCases = Integer.parseInt(sc.nextLine());

        for (int z = 0; z < totalCases; z++) {
            sc.nextLine();
            int[] arr = Stream.of(sc.nextLine().split(" ")).mapToInt(m->Integer.parseInt(m)).toArray();
            //mapSolution(arr);
            visitMarkSolution(arr);
        }
    }

    static void visitMarkSolution(int[] arr ){
        int i;
        int missing =-1;
        int repeat =-1;
        for (i = 0; i < arr.length; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                repeat = (abs_val);
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                missing= (i + 1);
        }
        System.out.println(repeat + " "+missing);
    }
    static void mapSolution(int[] arr ){
        HashMap<Integer,Integer> map = new HashMap<>();
        int repeat = -1;
        int currTotalWithoutRepeat = 0;
        for (int i = 0; i < arr.length; i++) {
            Integer count = map.get(arr[i]);
            if(count==null){
                map.put(arr[i],1);
                currTotalWithoutRepeat+= arr[i];
            }else {
                repeat = arr[i];
            }
        }

        int n= arr.length;
        int totalShouldBe = n*(n+1)/2;
        int missing = totalShouldBe - currTotalWithoutRepeat;
        System.out.println(repeat + " "+missing);
    }
    static void sortSolution(int[] arr ){
        Arrays.sort(arr);
        int prev = 0;
        boolean isMissingFound = false;
        int missing =-1;
        int repeat =-1;
        for (int i = 0; i < arr.length; i++) {
            if(prev == arr[i]){
                repeat= arr[i];
            }else if( (arr[i] - prev) >1 ){
                isMissingFound = true;
                missing= (prev+1);
            }

            prev = arr[i];
        }
        if(!isMissingFound)
            missing= (prev+1);

        System.out.println(repeat + " "+missing);
    }
}
