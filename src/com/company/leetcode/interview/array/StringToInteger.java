package com.company.leetcode.interview.array;

public class StringToInteger {

    public static void main(String[] args) {
        String str = "-91283472332";
        char[] arr = str.trim().toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        boolean isNegative = false;
        boolean isSigned = false;
        if(arr[i]=='-' || arr[i]=='+'){
            isSigned = true;
            if(arr[i]=='-')
                isNegative = true;
            i++;

        }

        int count=0;
        for (; i < arr.length; i++) {
            if(Character.isDigit(arr[i])){
                stringBuffer.append(arr[i]);
                count++;
            }else{
                break;
            }
        }

        int limit = 0;
        if(isSigned){
            limit++;
            count++;
        }

        double sum= 0;

        for (int j = count-1; j >= limit ; j--) {
            sum+= Math.pow(10.0,count-j-1) * (arr[j]-'0');
        }
        if(isNegative)
            sum = -1*sum;
        System.out.println((int)sum);
        System.out.println(stringBuffer.toString());
    }
}
