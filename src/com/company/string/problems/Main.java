package com.company.string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list1 = new ArrayList<>();
        list1.add("K1");
        list1.add("V11");
        list1.add("V12");
        list1.add("V13");
        List<String> list2 = new ArrayList<>();
        list2.add("K2");
        list2.add("V21");
        list2.add("V22");
        list2.add("V23");

        List<List<String>> details = new ArrayList<>();
        details.add(list1);
        details.add(list2);

        //////////////////////////////////////////////////
        List<Map<String,List<String>>> listMap = new ArrayList<>();
        for(int i =1 ; i < details.get(0).size() ; i ++){
            final int k = i;
            Map<String,List<String>>  map = new HashMap<>();
            details.stream().forEach(m-> {
                List<String> values = map.get(m.get(0));
                if(values ==null){
                    values = new ArrayList<>();
                }
                values.add(m.get(k));
                map.put(m.get(0),values);
            });
            listMap.add(map);
        }

        System.out.println(listMap);
    }
}
