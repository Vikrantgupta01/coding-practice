package com.company.string.problems;

public class WordPermutation {

    public static void main(String[] args) {
        String viks = "sikrantgupta";
        String kisv = "guptavikrant";

        int[] alpha = new int[26];
        if(viks.length()== kisv.length()){
            char[] a = viks.toCharArray();
            char[] b = kisv.toCharArray();
            for (int i =0 ; i<viks.length();i++){
                alpha[a[i]-97]++;
                alpha[b[i]-97]--;
            }
            for (int i : alpha) {
                if(i != 0){
                    System.out.println("NOT EQUAL");
                    break;
                }
            }

        }
    }
}
