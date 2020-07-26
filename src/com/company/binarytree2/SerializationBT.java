package com.company.binarytree2;

import java.util.*;

public class SerializationBT {

    public static void main(String[] args) {
        String bt = "1,2,3,N,N,4,N,N,5,N,N";
        TreeNode treeNode = null;

        List<String> list = new ArrayList<>(Arrays.asList(bt.split(",")));
        TreeNode head = deSerialize(list);
        System.out.println(head);
        String s = "";
        ArrayList<String> list1 = new ArrayList<>();
        serialize(head,list1);
        list1.stream().forEach(System.out::print);
    }

    public static TreeNode deSerialize(List<String> list) {
        TreeNode treeNode = null;
        if (list.size() > 0) {
            if (!list.get(0).equalsIgnoreCase("N")) {
                treeNode = new TreeNode(Integer.parseInt(list.get(0)));
            } else {
                list.remove(0);
                return null;
            }

        }
        list.remove(0);
        treeNode.left = deSerialize(list);
        treeNode.right = deSerialize(list);
        return treeNode;
    }

    public static void serialize(TreeNode head, ArrayList<String> list1) {
        if (head != null) {
            list1.add( head.val + "");
            serialize(head.left, list1);
            serialize(head.right, list1);
        }else {
            list1.add("N") ;
        }

    }
}
