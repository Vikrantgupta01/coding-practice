package com.company.leetcode.interview.array;

public class NoOfIsland {

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','1'}
        };

        System.out.println(new NoOfIsland().numIslands(grid));
    }

    public int numIslands(char[][] grid) {

        int numRow = grid.length ;
        int noOfColums = grid[0].length;
        int island = 0;

        for(int i=0 ; i< numRow ; i++)
        {
            for(int j =0 ; j< noOfColums ; j++)
            {
                if(grid[i][j]=='1'){
                    island++;
                    traverseIsland(grid,i , j,numRow ,noOfColums);
                }
            }
        }
        return island;
    }

    public void traverseIsland(char[][] grid,int i, int j, int numRow , int noOfColums){

        if(i<0 || j <0 ||  i == numRow || j== noOfColums || grid[i][j] =='0' || grid[i][j] =='0' )
            return ;

        if(grid[i][j]=='1'){
            grid[i][j] = '2';
            traverseIsland(grid,i+1, j,numRow ,noOfColums);
            traverseIsland(grid,i-1, j,numRow ,noOfColums);
            traverseIsland(grid,i, j+1,numRow ,noOfColums);
            traverseIsland(grid,i, j+1,numRow ,noOfColums);
        }
    }
}
