package com.company.bst.problems;

public class HoeghtOfBst {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        System.out.println(getHeight(binarySearchTree.getRoot())-1);

    }

    public static int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(getHeight(node.getRight()),getHeight(node.getLeft()));
    }

}
