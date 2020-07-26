package com.company.leetcode.interview.array;

import java.util.*;

public class PhoneNumberWords {

    public static void main(String[] args) {


        int[][] intervals = null;
        Arrays.sort(intervals, (c1,c2) ->{
            return c1[0] - c2[0];
        });
        System.out.println();
        Stack<int[]> ints= new Stack<>();
        LinkedList<String> strings = new LinkedList<>();
        strings.add("vik1");
        strings.add("vi2");
        int[][] result = new int[ints.size()][2];
        System.out.println(strings.remove());
        strings.add("vi3");
        System.out.println(strings.remove());

        Map<Integer,Integer> map = new HashMap<>();
        strings.add("vi5");
        System.out.println(strings.remove());
        System.out.println(strings.remove());
    }

    public void topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        List<String>  list = new ArrayList<>(map.keySet());
        Comparator<String> comparator = (c1,c2) -> {
            if( map.get(c2) == map.get(c1)){
                return c1.compareTo(c2);
            }
            return map.get(c2) - map.get(c1);
        } ;
;    }
}
