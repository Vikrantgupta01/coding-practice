package com.company.linklist.problems;

public class LoopDetection {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,22};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }
        linkList.addNode(new Node(55));


    }


}
