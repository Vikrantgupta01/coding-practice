package com.company.string.problems;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "waterbottel";
        String str2 = "erbottlewat";
        int cursor1=0;
        int cursor2=0;
        char[] alpha1 = str1.toCharArray();
        char[] alpha2 = str2.toCharArray();
        int match = 0;
        while (true){
            char c1 = alpha1[cursor1];
            char c2 = alpha2[cursor2];
            if(c1 != c2){
                cursor2++;
                cursor1=0;
                match =0;
            }else{
                cursor1++;
                cursor2++;
                match++;
            }
            if(cursor2 == alpha2.length ){
                if(match>0){
                    cursor2 = 0;
                }else {
                    break;
                }
            }
            if(match == alpha1.length){
                System.out.println("Yuppie !!!");
                break;
            }
        }
    }
}
