package com.company.string.problems;

public class Compression {

    public static void main(String[] args) {
        String str = "aaaaabbbaabbabababaiiiiiinnnnnaaa";
        char[] alpha = str.toCharArray();
        char prev = alpha[0];
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < alpha.length  ; i++) {
            char c = alpha[i];
            if(prev==c){
                count++;
            }else{
                sb.append(prev+""+count);
                count=1;
                prev =c;
            }
        }
        sb.append(prev+""+count);

        System.out.println(sb.toString());

    }
}
