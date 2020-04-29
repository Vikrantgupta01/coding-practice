package com.company.binarytree.problems;

import java.util.*;

public class RearrangeCharacters {

    public static void main(String[] args) {
        String str = "aaaaaabbcc";
        char[] charArr = str.toCharArray();
        HashMap<Character,Integer>  map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            Integer count = map.get(charArr[i]);
            if(count == null){
                count =0;
            }
            map.put(charArr[i], ++count);
        }

        Comparator<CharCounter> charCounterComparator = (CharCounter c1, CharCounter c2)-> c2.getCount() - c1.getCount();
        PriorityQueue<CharCounter> queue = new PriorityQueue<>(charCounterComparator);
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            queue.add(new CharCounter(entry.getKey(),entry.getValue()));
        }

        StringBuffer stringBuffer = new StringBuffer();
        while (!queue.isEmpty()){
            CharCounter c1 = queue.poll();
            stringBuffer.append(c1.getC());
            c1.setCount(c1.getCount()-1);

            CharCounter c2 = queue.poll();
            if(c2 != null){
                stringBuffer.append(c2.getC());
                c2.setCount(c2.getCount()-1);
                if(c2.getCount()>0)
                    queue.add(c2);

            }
            if(c1.getCount()>0)
                queue.add(c1);
        }

        System.out.println(stringBuffer.toString());

    }



}

class CharCounter{

    private char c;
    private  int count;

    public CharCounter(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public char getC() {
        return c;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
