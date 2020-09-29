package com.uac;

import java.util.regex.Pattern;

public class TestUACStringIndex {

    /*

findAllIndices('the fox jumps over the dog', 'the')
// expecting [0, 19]

findAllIndices('the fox jumps over the dog', 'brown')
// expecting []

findAllIndices('the fox jumps over the dog', 'o')
// expecting [5, 14]

findAllIndices('the fox jumps over the dog', ' ');
// expecting [3, 7, 13, 18, 22]

     */
    public static void main(String[] args) {
        String  target =  "the fox jumps over the dog";
        String search = " " ;

        char[] targetArr = target.toCharArray();
        char[] searchArr = search.toCharArray();
        int i =0;
        int j =0;

        for (int k = 0; k < targetArr.length; k++) {

            if(j == searchArr.length){
                System.out.println("Found "+ (k-j));
                j=0;
            }
            if(targetArr[k] == searchArr[j]){
                j++;
            }else{
                j = 0;
            }
        }

    }
}
