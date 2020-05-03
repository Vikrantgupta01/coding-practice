package com.company.bst.problems;

public class CheckBst {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        int min = 0;
        int max = Integer.MAX_VALUE;
        boolean result = ifNodeInRange(binarySearchTree.getRoot(), min, max);
        System.out.println(result);
    }

    public static boolean ifNodeInRange(Node  node, int min, int max){
        if(node ==null){
            return true;
        }
        else if( node.getData() > min && node.getData()<max){
            return ifNodeInRange(node.getLeft(), min, node.getData()) && ifNodeInRange(node.getRight(), node.getData(), max);
        }else{
            return false;
        }
    }
}
