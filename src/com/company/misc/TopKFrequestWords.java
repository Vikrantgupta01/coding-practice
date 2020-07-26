package com.company.misc;

import java.util.*;

public class TopKFrequestWords {

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String s : words){
            map.put(s.toLowerCase(),map.getOrDefault(s,0)+1);
        }

        Comparator<String> comparator = (String s1, String s2) -> {
            return map.get(s1) - map.get(s2);
        };
        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list,comparator);

        for(String s: list){
            System.out.println(s);
        }

    }
}
