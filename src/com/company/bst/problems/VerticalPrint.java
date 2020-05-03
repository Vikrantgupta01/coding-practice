package com.company.bst.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class VerticalPrint {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = BinarySearchTree.getBinarySearchTree();
        TreeMap<Integer, List<Node>> map = new TreeMap<>();
        getPositionMapping(binarySearchTree.getRoot(),0,map);

        for (Integer integer: map.keySet()) {
            System.out.print(integer + " --,> ");
            map.get(integer).stream().forEach(m-> System.out.print(m.getData()+"\t"));
            System.out.println();
        }
    }

    public static void getPositionMapping(Node node, int currtPos, TreeMap<Integer, List<Node>> map){
        if(node!=null){
            List<Node> list = map.get(currtPos);
            if(list==null){
                list = new ArrayList<>();
                map.put(currtPos,list);
            }
            list.add(node);

            getPositionMapping(node.getLeft(),currtPos -1,map);
            getPositionMapping(node.getRight(),currtPos+1,map);
        }

    }
}
