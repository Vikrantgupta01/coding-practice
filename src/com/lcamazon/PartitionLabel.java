package com.lcamazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {

    public static void main(String[] args) {
        System.out.println(partitionLabels("caedbdedda"));
    }

    public static List<Integer> partitionLabels(String S) {

        int[] pos = new int[256];
        char[] arr = S.toCharArray();
        for(int i =0 ;i<arr.length; i++){
            pos[arr[i]] =i;
        }

        List<Integer> results = new ArrayList<>();
        int start = 0;
        int max =0;
        while(max<arr.length){
            for(int i =start ;i<= max && i< S.length(); i++){
                int lastPos = pos[arr[i]];
                max= Math.max(lastPos,max);

            }
            results.add(max-start+1);
            start=max+1;
            max =start;
        }
        return results;
    }
}
