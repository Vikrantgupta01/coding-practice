package com.company.string.problems;

public class KmpLearning {

    public static void main(String[] args) {
        String str = "aabaaab";
        char[] arr =  str.toCharArray();
        int[] lps = new int[str.length()];
        int ptr = 1;
        int count =0 ;
        while (ptr< str.length()){
            if(arr[ptr] == arr[count]){
                lps[ptr] = ++count;
                ptr++;
            }else {
                if(count !=0){
                    count = lps[count-1];
                }else{
                    lps[ptr] = count;
                    ptr++;
                }
            }
        }
        System.out.println(lps);
    }
}
