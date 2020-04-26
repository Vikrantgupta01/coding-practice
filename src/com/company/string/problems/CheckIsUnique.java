package com.company.string.problems;
public class CheckIsUnique {

    public static void main(String[] args) {
        String str = "vikrantar";
        int a = 'a';
        //System.out.println(a);
        //65-90 A-Z
        //97-122 a-z

        int[] alpha = new int[26];
        for (char c: str.toCharArray()) {
            if(alpha[c -97]==0){
                alpha[c -97]++;
            }else{
                System.out.println("Duplicate char is "+c);
            }
        }

    }
}
