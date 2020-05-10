package com.company.string.problems;

public class AnagramCheck {

    public static void main(String[] args) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";


        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            arr1[c1[i]-97]++;
            arr2[c2[i]-97]++;
        }

        boolean result = true;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                System.out.println("NO");
                result =false;
                break;
            }
        }
        if (result)
            System.out.println("YES");

    }
}
