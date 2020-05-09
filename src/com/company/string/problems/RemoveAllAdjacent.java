package com.company.string.problems;

public class RemoveAllAdjacent {
    public static void main(String[] args) {
        String str=  "abbbaca";

        char[] arr = str.toCharArray();
        removeDuplicate(arr);
        System.out.println(arr);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != '0')
                stringBuffer.append(arr[i]) ;
        }

        System.out.println(stringBuffer.toString());

    }

    static void removeDuplicate(char[] arr){
        char prev = '0';
        int count = 0;
        int prevPos = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] =='0')
                continue;

            if(prev == arr[i]){
                prev = arr[i] ;
                arr[i] = '0';
                arr[prevPos] = '0';
                count++;
            }else{
                prev = arr[i] ;
            }
            prevPos =i;
        }
        if(count>0)
            removeDuplicate(arr);
    }
}
