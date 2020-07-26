package com.company.leetcode.interview.array;

public class CompareVersionNumbers {

    public static void main(String[] args) {
        String version1 = "1";
        String version2 = "0";

        System.out.println(new CompareVersionNumbers().compare(version1,version2));
    }

    public int compare(String version1 ,String version2){
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");
        int max = Math.max(strings1.length,strings2.length);

        int count =0;
        double sum1=0.0;
        for (int i = max; i > 0 && count<strings1.length ; i--) {
            sum1 +=Double.parseDouble(strings1[count++]) * Math.pow(10.0,i);
        }
        count =0;
        double sum2=0.0;
        for (int i = max; i > 0 && count<strings2.length ; i--) {
            sum2 +=Double.parseDouble(strings2[count++]) * Math.pow(10.0,i);
        }

        if(sum1==sum2){
            return 0;
        }else if(sum1>sum2){
            return 1;
        }else{
            return -1;
        }
    }
}
