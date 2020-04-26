package com.company.string.problems;

public class URLify {

    public static void main(String[] args) {
        String str = "Mr john Smith    ";
        char[] charArray = str.toCharArray();

        int lastCharPosition = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] != ' '){
                lastCharPosition = i;
            }
        }

        int counter = charArray.length-1;
        for (int i = lastCharPosition ; i >=0 ; i--) {
            if(charArray[i] == ' '){
                charArray[counter--]  = '0';
                charArray[counter--]  = '2';
                charArray[counter--]  = '%';
            }else {
                charArray[counter--]  = charArray[i];
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }
}
