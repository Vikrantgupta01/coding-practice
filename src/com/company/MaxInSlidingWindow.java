package com.company;

import java.util.ArrayList;
import java.util.List;

public class MaxInSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {-4,2,-5,1,-1,6};

        int w= 3;
        List<Integer> sum = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(i>2){
                sum.add(total);
                total -= arr[i-3];
            }
            total +=arr[i];
        }
        sum.add(total);
        for (int i: sum
             ) {
            System.out.println(i);
        }


    }
}
