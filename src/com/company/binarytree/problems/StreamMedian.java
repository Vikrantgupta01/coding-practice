package com.company.binarytree.problems;

public class StreamMedian {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,8,9};

        MaxHeapImp maxHeapImp = new MaxHeapImp();
        MinHeapImp minHeapImp = new MinHeapImp();
        for (int i = 0; i < arr.length; i++) {
            if(maxHeapImp.getSize()==0 && minHeapImp.getSize()==0){
                maxHeapImp.insert(arr[i]);
                System.out.println(arr[i]);
                continue;
            }else if(minHeapImp.getSize()==0){
                minHeapImp.insert(arr[i]);
            }else {
                if(maxHeapImp.top() < arr[i]){
                    minHeapImp.insert(arr[i]);
                }else{
                    maxHeapImp.insert(arr[i]);
                }
            }



            if ( Math.abs(maxHeapImp.getSize()- minHeapImp.getSize()) ==2 ){
                if(maxHeapImp.getSize() > minHeapImp.getSize()){
                    minHeapImp.insert(maxHeapImp.pop());
                }else{
                    maxHeapImp.insert(minHeapImp.pop());
                }
            }
            if ( Math.abs(maxHeapImp.getSize()- minHeapImp.getSize()) ==1 ){
                if(maxHeapImp.getSize() > minHeapImp.getSize()){
                    System.out.println(maxHeapImp.top());
                    continue;
                }else{
                    System.out.println(minHeapImp.top());
                    continue;
                }
            }

            if(maxHeapImp.getSize() == minHeapImp.getSize()){
                float f1 = maxHeapImp.top();
                float f2 = minHeapImp.top();
                System.out.println((f1+f2)/2);
                continue;
            }

        }
    }
}
