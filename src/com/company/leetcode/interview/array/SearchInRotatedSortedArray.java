package com.company.leetcode.interview.array;

import java.util.ArrayList;
import java.util.List;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println("l.get(0) instanceof Integer" .substring(8,4));
        int[] arr = {3,4,5,6,1,2};
        int target = 2;
        System.out.println(search(arr,target));
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;
        int result = search(nums,target,start,end);
        return result;
    }

    private static int search(int[] nums,int target,int start , int end ){
        int mid = start+ (end - start)/2;
        if(mid == start){
           if(nums[end]==target){
               return end;
           }
            if(nums[start]==target){
                return start;
            }
        }
        if( nums[start] <=  nums[mid] && target >= nums[start] && target <= nums[mid]){
            return search(nums,target,start,mid);
        }else  if( nums[mid+1] <=  nums[end] && target >= nums[mid+1] && target <= nums[end]){
            return search(nums,target,mid+1,end);
        }else if (nums[start] > nums[mid] && (target >= nums[start] || target <= nums[mid])){
            return search(nums,target,start,mid);
        }else if (nums[mid+1] > nums[end] && (target >= nums[mid+1] || target <= nums[end])){
            return search(nums,target,mid+1,end);
        }
        return -1;
    }
}
