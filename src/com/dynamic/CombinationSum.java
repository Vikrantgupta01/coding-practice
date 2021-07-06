package com.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {


    public static void main(String[] args) {
        int[] arr = {10,2,7,6,1,5};
        Arrays.sort(arr);
        new CombinationSum().backtrackingSolution(arr , 8, 0,0,new ArrayList<Integer>());
    }

    public void backtrackingSolution(int[] arr , int target, int sum , int pos, List<Integer> list){

        if(sum==target){
            System.out.println(list);
            return;
        }
        if(sum > target){
            return;
        }
        for (int i = pos; i <  arr.length; i++) {
            list.add(arr[i]);
            backtrackingSolution(arr, target,sum + arr[i],i+1,list);
            list.remove(list.size()-1);
        }

    }
}
