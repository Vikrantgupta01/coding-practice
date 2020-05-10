package com.company.string.problems;

public class AntiClockwiseShift {

    public static void main(String[] args) {
        String str = "geeksgeeksfor";
        int lastIndex = str.length()-1;
        int shift = 2 ;
        char[] crr = str.toCharArray();
        reverse(0,lastIndex,crr);
        reverse(0,lastIndex-shift,crr);
        reverse(lastIndex-shift+1 ,lastIndex,crr);
        System.out.println(crr);
    }

    static void reverse(int i, int j,  char[] crr ){
        int liength = i + 1+ (j-i)/2 ;
        for (int k = i; k < liength ; k++) {
            char temp = crr[j];
             crr[j] = crr[k];
             crr[k] = temp;
             j--;
        }
    }
}
