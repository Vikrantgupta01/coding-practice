package com.company;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[][] grid = {
                {1,2}
        };

        System.out.println(new Test().orangesRotting(grid));
    }
    int minute = 3;
    public int orangesRotting(int[][] grid) {


        while(true){
            if(process(grid)>0){
                minute++;
            }else{
                break;
            }
        }

        boolean isAllRotten = false;
        int numRow = grid.length ;
        int noOfColums = grid[0].length;
        for(int i=0 ; i< numRow ; i++)
        {
            for(int j =0 ; j< noOfColums ; j++)
            {
                if(grid[i][j]==1){
                    isAllRotten = true;
                }
            }
        }

        if(isAllRotten){
            return -1;
        }else{
            return minute-3;
        }

    }

    int process(int[][] grid){
        int count = 0;
        int numRow = grid.length ;
        int noOfColums = grid[0].length;
        for(int i=0 ; i< numRow ; i++)
        {
            for(int j =0 ; j< noOfColums ; j++)
            {
                if(grid[i][j] == (minute-1)){
                    boolean isAnyPro = dfs(grid,i+1, j,numRow ,noOfColums) |
                            dfs(grid,i-1, j,numRow ,noOfColums) |
                            dfs(grid,i, j+1,numRow ,noOfColums) |
                            dfs(grid,i, j-1,numRow ,noOfColums);

                    if(isAnyPro){
                        count++;
                    }
                }
            }
        }
        return count;

    }
    boolean dfs(int[][] grid, int i, int j,int numRow ,int noOfColums ){

        if(i<0 || j <0 ||  i == numRow || j== noOfColums || grid[i][j] ==0 || grid[i][j] ==0 )
            return false ;

        if(grid[i][j]==1){
            grid[i][j] = minute;
            return true ;
        }
        return false ;
    }
}
