package com.company.matrix.problems;

import java.util.ArrayList;
import java.util.List;

public class PossiblePath {

    public static void main(String[] args) {
        char[][] charMatrix = new char[3][3];
        charMatrix[0][0] = 'A';
        charMatrix[0][1] = 'B';
        charMatrix[0][2] = 'C';
        charMatrix[1][0] = 'D';
        charMatrix[1][1] = 'E';
        charMatrix[1][2] = 'F';
        charMatrix[2][0] = 'G';
        charMatrix[2][1] = 'H';
        charMatrix[2][2] = 'I';

        /*for (int i = 0; i < charMatrix.length; i++) {
            System.out.println();
            for (int j = 0; j < charMatrix[i].length; j++) {
                System.out.print(charMatrix[i][j] + " ");
            }
        }*/


        findPath(1,0,charMatrix, "A");
        findPath(0,1,charMatrix, "A");
    }


    public static void findPath(int i, int j ,  char[][] charMatrix , String str){
        str = str+charMatrix[i][j];
        if(charMatrix[i][j]=='I'){
            System.out.println(str);
            return;
        }
        if(i < 2){
            findPath(i+1,j,charMatrix, str);
        }
        if(j < 2){
            findPath(i,j+1,charMatrix,str);
        }
        return ;
    }
}
