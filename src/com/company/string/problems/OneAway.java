package com.company.string.problems;

public class OneAway {
    public static void main(String[] args) {

        String str1 = "bake";
        String str2 = "pale";


        if(str1.length() > str2.length()){
            // removal
            boolean foundDiff = false;
            for (int i = 0 , j = 0; i < str1.length() && j <str2.length();  ) {
                if(str1.charAt(i) != str2.charAt(j)){
                    if(foundDiff)
                        System.out.println("more than one diff");
                    foundDiff = true;
                    i++;
                }else {
                    i++ ;
                    j++ ;
                }
            }

        }else if(str1.length() < str2.length()){
            // insert
            boolean foundDiff = true;
            for (int i = 0 , j = 0; i < str1.length() && j <str2.length();  i++ ,j++) {
                if(str1.charAt(i) != str2.charAt(j)){
                    if(foundDiff)
                        System.out.println("more than one diff");
                    foundDiff = true;
                    j++;
                }
            }
        }else {
            // replace
            boolean foundDiff = true;
            for (int i = 0 , j = 0; i < str1.length() && j <str2.length();  i++ ,j++) {
                if(str1.charAt(i) != str2.charAt(j)){
                    if(foundDiff)
                        System.out.println("more than one diff");
                    foundDiff = true;
                }
            }
        }
    }
}
