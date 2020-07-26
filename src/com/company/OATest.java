package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OATest {

    public static void main(String[] args) {

        subStringsLessKDist("", 5);
    }

    public static List<String> subStringsLessKDist(String inputString, int num)
    {
        List<String> strings = new ArrayList<>();
        char[] chars =  inputString.toCharArray();

        Map<Character,Integer> integerMap = new HashMap<>();
        for (int i = 0; i < chars.length && i<num; i++) {
            integerMap.put(chars[i],integerMap.getOrDefault(chars[i],0)+1);
        }

        for (int i = num; i <= chars.length ; i++) {

            if(isValid(integerMap,num+1)){
                strings.add(inputString.substring(i-num,i));
            }
            if(i < chars.length){
                integerMap.put(chars[i-num],integerMap.getOrDefault(chars[i-num],0)-1);
                integerMap.put(chars[i],integerMap.getOrDefault(chars[i],0)+1);
            }


        }


        return strings;
    }

    public static boolean isValid( Map<Character,Integer> integerMap, int desiredSum){
        boolean oneRepeat = false ;
        for (Character character : integerMap.keySet()) {
            int count = integerMap.get(character);
            if(count > 2){
                return false;
            }else if(count==2){
                if(oneRepeat){
                    return false;
                }else {
                    oneRepeat = true;
                }
            }
        }

        return oneRepeat;
    }
}
