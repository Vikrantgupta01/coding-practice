package com.company.recurrsion.problems;

import com.company.linklist.problems.LinkList;
import com.company.linklist.problems.Node;

import java.util.Stack;

public class Josephus {

    public static void main(String[] args) {
        int lengthOfCircle = 3;
        int k = 2;

        LinkList linkList = new LinkList();
        for (int i = 1; i < lengthOfCircle; i++) {
            linkList.addNode(new Node(i));
        }
        Node node = new Node(lengthOfCircle);
        node.nextNode = linkList.getHead();
        linkList.addNode(node);
        Node node1 = linkList.getHead();
        k--;
        while (linkList.getSize()>1){
            node1 = node1.nextNode;
            k--;
            if(k==0){
                linkList.deleteNode(node1);
                k = 2;
            }
        }
        System.out.println(linkList.getHead().value);
    }
}
