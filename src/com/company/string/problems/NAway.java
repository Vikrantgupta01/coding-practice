package com.company.string.problems;

public class NAway {

    public static void main(String[] args) {
        String str1 = "pale";
        String str2 = "bale";
        int diffCount = 0 ;
        if(str1.length()==str2.length()){
            for (int i =0 ; i < str1.length(); i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    diffCount++;
                }
            }

        }else  {
            int maxLength = str1.length()>str2.length()?str1.length():str2.length();
            int cursor1 = 0;
            int cursor2 = 0;
            while (cursor1 < maxLength && cursor2 < maxLength && diffCount <2){
                if(str1.charAt(cursor1)!=str2.charAt(cursor2)){
                   if(str1.length()>str2.length()){
                       cursor1++;
                   }else{
                       cursor2++;
                   }
                   diffCount++;
                }else{
                    cursor2++;
                    cursor1++;
                }
            }
        }
        System.out.println(diffCount==1);
    }
}
