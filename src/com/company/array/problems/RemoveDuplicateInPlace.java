package com.company.array.problems;

public class RemoveDuplicateInPlace {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println(nums);
    }
    public static int removeDuplicates(int[] nums) {

        int dupl =0;
        if(nums.length>0){
            int prev = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i-dupl] = nums[i];
                if(prev == nums[i]){
                    dupl++;
                }
                prev = nums[i];
            }
        }

        return nums.length-dupl;
    }
}
