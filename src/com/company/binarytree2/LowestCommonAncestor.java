package com.company.binarytree2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        String str = "3,5,6,N,N,2,7,N,N,4,N,N,1,0,N,N,8,N,N";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
        TreeNode treeNode = SerializationBT.deSerialize(list);

        List<TreeNode> treeNodes = new ArrayList<>();
        getPath(treeNode, 4, treeNodes);
        treeNodes.stream().forEach(m -> System.out.println(m.val));

        System.out.println("------------------------------------------");

        List<TreeNode> treeNodes1 = new ArrayList<>();
        getPath(treeNode, 2, treeNodes1);
        treeNodes1.stream().forEach(m -> System.out.println(m.val));

        System.out.println("------------------------------------------");
        int counter = 0;
        int prev =0;
        while (treeNodes.size() > counter && treeNodes1.size() > counter) {
            if (treeNodes.get(counter).val != treeNodes1.get(counter).val) {
                break;
            } else {
               prev = treeNodes.get(counter).val ;
            }
            counter++;
        }
        System.out.println(prev);


    }

    private static boolean getPath(TreeNode treeNode, int val, List<TreeNode> treeNodes) {
        if (treeNode == null) {
            return false;
        }
        treeNodes.add(treeNode);
        if (treeNode.val == val) {
            return true;
        }

        boolean found = getPath(treeNode.left, val, treeNodes);
        if (!found) {
            found = getPath(treeNode.right, val, treeNodes);
        }
        if (!found)
            treeNodes.remove(treeNode);

        return found;
    }
}
