package com.company.leetcode.interview.array;

import java.util.*;

public class GroupOfAnagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            String sortesS = getSorted(s);
            List<String> result = map.getOrDefault(sortesS, new ArrayList<String>());
            result.add(s);
            map.put(sortesS, result);
        }
        return new ArrayList<>(map.values());

    }


    String getSorted(String s1){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        return new String(c1);
    }
}
