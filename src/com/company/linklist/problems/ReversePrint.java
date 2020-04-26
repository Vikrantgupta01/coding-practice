package com.company.linklist.problems;

public class ReversePrint {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55,23,11,89,22};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }

        printElement(linkList.getHead());

    }

    static void printElement(Node node){
        if(node.nextNode !=null){
            printElement(node.nextNode);
        }
        System.out.print(node.value +", ");
    }
}
