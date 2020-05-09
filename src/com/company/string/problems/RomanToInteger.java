package com.company.string.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character,Integer> integerMap = new HashMap<>();
        integerMap.put('I',1);
        integerMap.put('V',5);
        integerMap.put('X',10);
        integerMap.put('L',50);
        integerMap.put('C',100);
        integerMap.put('D',500);
        integerMap.put('M',1000);



        String str = "LXXX";
        char[]  arr = str.toCharArray();
        int[]  values = new int[arr.length];
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int value = integerMap.get(arr[i]);
            values[i] = value;
            if(prev < value){
                values[i-1] = -1*values[i-1];
            }
            prev= value;
        }

        int total =0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        System.out.println(total);

    }


}
