package com.uac;

import java.util.HashMap;
import java.util.Map;

public class TestUACTwoSum {


    public static void main(String[] args) {
        //console.log(twoSum([3, 4, 9, 1, 7, 5, 5], 10));
        //// has to print [{index: 2, value: 9}, {index: 3, value: 1}]
        int[] arr = new int[]{3, 4, 9, 1, 7, 5, 5};
        int target = 10;

        findResult(arr,target);

    }

    public static void findResult( int[] arr, int target ){
        Map<Integer, Integer> mapValPos = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (mapValPos.containsKey(diff)) {
                System.out.print("[{index :" +  mapValPos.get(diff) + ", value "+diff+"},");
                System.out.print("{index :" +  i + ", value "+arr[i]+"}]");
                return;
            } else {
                mapValPos.put(arr[i], i);
            }
        }
    }


}
