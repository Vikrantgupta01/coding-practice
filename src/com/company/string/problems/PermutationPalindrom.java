package com.company.string.problems;

public class PermutationPalindrom {

    public static void main(String[] args) {
        String str = "Tactcoaooolp";

        int[] alpha = new int[26];
        for (char c: str.toCharArray()) {
            int i  = c>96 ? c-97 :c-65;
            alpha[i]++;
            if(alpha[i]==2){
                alpha[i] =0 ;
            }
        }
        int count = 0;
        for (int k : alpha) {
            count = count+k;
        }
        System.out.println(count);
        if(str.length()%2 == count){
            System.out.println("True");
        }
    }
}
