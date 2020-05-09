package com.company.string.problems;

public class StringPermutation {

    private static void permutations(String prefix, String remaining)
    {
        if(remaining.length()==0){
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            permutations(prefix+remaining.charAt(i), remaining.substring(0,i) + remaining.substring(i+1,remaining.length()));
        }
    }

    // generate all permutations of a String in Java
    public static void main(String[] args)
    {
        String s = "ABCD";
        permutations("",s);
    }
}
