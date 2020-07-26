package com.company.leetcode.interview.array;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC");

    }

    public String minWindow(String s, String t) {

        if(s.equals(t)){
            return s;
        }
        if(s.length()< t.length()){
            return "";
        }
        char[] arr = s.toCharArray();
        int[] tArr = new int[128];
        for(char c: t.toCharArray()){
            tArr[c]++;
        }
        Queue<Integer> q = new LinkedList<>();
        int ptr = 0;
        int i = 0;
        int j = 0 ;
        int match = 0;
        int length = Integer.MAX_VALUE;
        while(j < arr.length && i < arr.length){

            // to get start
            if(match==0){
                if(isPresent(arr[i],tArr) ){
                    j = i;
                    match++;

                }else{
                    i++;
                }
            }else {
                if(isPresent(arr[j],tArr)){
                    match++;
                    q.add(j);
                }
            }



            if(match == t.length()){
                if(j-i < length){
                    ptr = i;
                    length = j-i;
                }
                tArr[arr[i]]++;
                i = q.poll();

                match--;

            }
            j++;


        }
        if(length == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(ptr,ptr+length+1);
    }



    boolean isPresent(char c, int[] t){
        if(t[c] > 0){
            t[c]--;
            return true;
        }else{
            return false;
        }
    }

}
