package com.company.misc;

public class PowXN {

    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;


        double ans = 1;

        for (int i = 0; i < n; i++) {
            ans = ans * x;
        }

        System.out.println(ans);
        ans = x;
        for (int i = 1; i < n; ) {

            if (2 * i < n) {
                ans = ans * ans;
                i = 2 * i;
            } else {
                ans = ans * x;
                i++;
            }
        }

        System.out.println(ans);

    }
}
