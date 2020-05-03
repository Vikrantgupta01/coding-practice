package com.company.bst.problems;

import java.util.HashMap;
import java.util.TreeMap;

public class BottomView {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        TreeMap<Integer,Node> map = new TreeMap<>();
        getHeightWithNode(binarySearchTree.getRoot(),0,map);
        for (Integer integer: map.keySet()) {
            System.out.println(integer + "   "+ map.get(integer).getData());
        }
    }

    public static void getHeightWithNode(Node node, int currentPos, TreeMap<Integer,Node> map){
        if(node!=null){
            map.put(currentPos,node);
            getHeightWithNode(node.getLeft(),currentPos-1,map);
            getHeightWithNode(node.getRight(),currentPos+1,map);
        }
    }
}
