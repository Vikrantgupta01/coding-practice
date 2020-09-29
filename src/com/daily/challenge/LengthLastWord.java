package com.daily.challenge;

public class LengthLastWord {

    public static void main(String[] args) {
        new LengthLastWord().lengthOfLastWord("a");
    }
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = arr.length-1 ; i >=0; i-- ){
            if(arr[i]!=' '){
                cnt++;
            }else{
                return cnt;
            }
        }
        return cnt;
    }
}
