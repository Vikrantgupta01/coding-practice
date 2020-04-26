package com.company;

    public class RotateArray {

        public static void main(String[] args) {
            int[] arr = { 75, 78,85,92, 99 , 1, 4, 7, 34, 45, 49 , 51, 57, 59, 66, 69, 72};

            int  k = 3;

            for (int i = 0; i < arr.length/2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }


            for (int i = 0; i < (k-1)/2; i++) {
                int temp = arr[i];
                arr[i] = arr[k-1-i];
                arr[k-1-i] = temp;
            }
            System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            for (int i = k; i < (arr.length)/2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
            System.out.println("");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }

        }



}
