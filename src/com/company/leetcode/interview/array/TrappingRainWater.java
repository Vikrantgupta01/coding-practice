package com.company.leetcode.interview.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] left = new int[12];
        int[] right = new int[12];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            left[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
            }
            right[i] = max;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }

    }
}
