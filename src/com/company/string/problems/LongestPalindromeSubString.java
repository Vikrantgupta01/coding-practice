package com.company.string.problems;

public class LongestPalindromeSubString {
        // todo:; still need work
    public static void main(String[] args) {
        String s = "fyfvladzpbfudkklrwq";
        char[] str = s.toCharArray();
        int prevLenght = 0;
        int p = 0;
        int q = 0;
        for (int k = 0; k < str.length; k++) {
            int i = k;
            int j = str.length - 1;
            boolean matchSTart = false;
            int m = 0;
            while (i <= j) {
                if (str[i] == str[j]) {
                    if (!matchSTart) {
                        matchSTart = true;
                        m = j;
                    }
                    i++;
                    j--;

                } else {
                    if (matchSTart) {
                        matchSTart = false;
                        break;
                    } else {
                        j--;
                    }

                }
            }
            if (matchSTart) {
                int length = m - k + 1;
                if (length > prevLenght) {
                    prevLenght = length;
                    p = k;
                    q = m;

                }
            }
        }
        System.out.println(s.substring(p, q + 1));

    }
}
