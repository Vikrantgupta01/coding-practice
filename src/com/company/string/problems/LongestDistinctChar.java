package com.company.string.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctChar {
    public static void main(String[] args) {
        String str = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int strLen = str.length();
        Set<Character> characters = new HashSet<>();
        while (i < strLen && j < strLen) {
            if(!characters.contains(str.charAt(j))){
                characters.add(str.charAt(j));
                j++;
                maxCount = Math.max(maxCount,j-i);
            }else {
                characters.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(maxCount);
    }
}
