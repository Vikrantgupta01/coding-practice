package com.company.dp;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int i = 0;
        int j = 0;

        int maxSum = arr[0];
        int currSum = arr[0];
        for (int k = 1; k < arr.length ; k++) {
            if(arr[k] < currSum+arr[k]){

                currSum = currSum+arr[k];
                if(currSum>maxSum){
                    j++;
                    maxSum = currSum;
                }
            }else{
                currSum = arr[k];
                i = k;
                j = k ;
            }
        }
        System.out.println(maxSum);
        System.out.println(i +"   "+j);
    }
}
