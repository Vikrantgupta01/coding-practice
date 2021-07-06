package com.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StringPermutation {


    HashMap<Character,String> map = new HashMap<>();
    {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public static void main(String[] args) {

        String numbers = "523";
        List<String> output = new ArrayList<>();
        char[] result = new char[3];
        new StringPermutation().backtrackingSolution(numbers.toCharArray(), output, result, 0);
        for (String s: output) {
            System.out.println(s);
        }

    }




    public void backtrackingSolution( char[] numbsers, List<String> output,char[] result, int i){


        if(i==result.length){
            output.add(new String(result));
            return;
        }
        System.out.println(numbsers);

        char[] arr = map.get(numbsers[i]).toCharArray();
        for (Character c: arr) {
            result[i] = c;
            backtrackingSolution(numbsers,output,result,i+1);

        }

    }



}
