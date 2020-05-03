package com.company.bst.problems;

import java.util.Stack;

public class LeftView {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();

        Stack<Node> global = new Stack<>();
        Stack<Node> local = new Stack<>();
        local.push(binarySearchTree.getRoot());
        int level = 0;
        int levelCounter = 0;
        while (!local.isEmpty()){
            while (!local.isEmpty()){
                global.push(local.pop());
            }
            System.out.println("level "+ (++level));
            while (!global.isEmpty()){
                Node node = global.pop();
                if(levelCounter ==0)
                    System.out.print(node.getData()+"   ");

                levelCounter++;
                if(node.getLeft()!=null){
                    local.push(node.getLeft());
                }
                if(node.getRight()!=null){
                    local.push(node.getRight());
                }
            }
            System.out.println();
            levelCounter = 0 ;
        }

    }
}
