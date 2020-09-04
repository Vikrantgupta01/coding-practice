package com.company.nuix;

import java.math.BigInteger;
import java.util.Stack;

public class Adder {


    public static void main(String[] args) {
        adder(75);
    }

    static int prev = 0;

    static void adder(int N) {
        BigInteger[] arr = new BigInteger[N];
        for(int i =0; i<N; i++){
            if(i<=2){
                System.out.println(i);
                arr[i] = BigInteger.valueOf(Integer.valueOf(i));
            }else{
                BigInteger sum =  BigInteger.ZERO;
                for (int j = i-3; j < i; j++) {
                    sum = sum.add(arr[j]);
                }
                arr[i] = sum;
                System.out.println(sum.toString());
            }
        }
    }
}
