package com.company.binarytree2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiameterBT {

    public static void main(String[] args) {
        String str = "3,5,7,9,N,N,2,7,N,N,4,N,N,1,0,N,N,8,N,N";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(",")));
        TreeNode treeNode = SerializationBT.deSerialize(list);
        System.out.println(getMaxLengthPath(treeNode));
        System.out.println(max_length);
    }

    static int  max_length = -1;
    public static int getMaxLengthPath(TreeNode treeNode){
        if(treeNode ==null){
            return 0;
        }
        int l = 1 + Math.max(getMaxLengthPath(treeNode.left),getMaxLengthPath(treeNode.right));
        max_length = Math.max(l,max_length);
        return l;
    }
}
