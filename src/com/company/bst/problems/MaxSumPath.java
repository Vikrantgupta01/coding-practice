package com.company.bst.problems;

public class MaxSumPath {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        System.out.println(getMAxSumPath(binarySearchTree.getRoot()));

    }

    public static int getMAxSumPath(Node node){
        if(node == null){
            return 0;
        }
        return node.getData() + Math.max(getMAxSumPath(node.getRight()),getMAxSumPath(node.getLeft()));
    }

}
