package com.company.string.problems;

public class Atoi {

    public static void main(String[] args) {
        String str = "123";
        char[] crr = str.toCharArray();

        int total =0 ;
        int counter =0 ;
        for (int i = crr.length - 1; i >= 0; i--) {
            int k = crr[i] -'0';
            if(k>=0 && k <=9){
                total +=  (crr[i]-'0') * Math.pow(10, counter++) ;
            }else{
                System.out.println("-1");
                return;
            }

        }
        System.out.println(total);


    }
}
