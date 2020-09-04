package com.company.leetcode.interview.array;

public class AnagramOfString {

    public static void main(String[] args) {

        String str = "abcd";
        new AnagramOfString().printAnagaram("",str);
    }

    private void printAnagaram(String str, String remaining){

        if(remaining.length()==0){
            System.out.println(str);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            printAnagaram(str+remaining.substring(i,i+1), remaining.substring(0,i)+remaining.substring(i+1));
        }

    }
}
