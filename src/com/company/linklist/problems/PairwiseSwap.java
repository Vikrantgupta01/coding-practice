package com.company.linklist.problems;

public class PairwiseSwap {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {33,2,3,5,11,55};
        for (int i : arr) {
            linkList.addNode(new Node(i));
        }

        Node node = linkList.getHead().nextNode;
        Node prev = linkList.getHead();
        linkList.setHead(node);
        while (node!=null){
            Node temp =  node.nextNode;
            node.nextNode = prev;
            prev.nextNode =  temp !=null ?  temp.nextNode : null; // 33->5
            prev = temp; //3
            node =  temp !=null? temp.nextNode :null;
        }
        linkList.printList();
    }
}
