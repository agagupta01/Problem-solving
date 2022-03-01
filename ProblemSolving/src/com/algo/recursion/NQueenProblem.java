package com.algo.recursion;

import java.util.*;

class NQueenProblem {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i <n ;i ++)
            for(int j =0;j <n ;j ++)
                board[i][j] = '.';
        
        int[] leftRow = new int[n];
        int [] upperDig = new int[2*n-1];
        int [] lowerDig = new int[2*n-1];
        
        solve(0,board,res,leftRow,upperDig,lowerDig);
        return res;
        
    }
    
    private void solve(int col,char[][] board,List<List<String>> res,int[] leftRow,int [] upperDig,int [] lowerDig){
        
        if(col == board.length){
            res.add(construct(board));
            return;
        }
        
        for(int row = 0; row < board.length; row++){
            if(leftRow[row] == 0 && upperDig[board.length - 1+col -row] == 0 && lowerDig[row+col] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                upperDig[board.length - 1+col -row] = 1;
                lowerDig[row+col] = 1;
                solve(col+1,board,res,leftRow,upperDig,lowerDig);
                board[row][col] = '.';
                leftRow[row] = 0;
                upperDig[board.length - 1+col -row] = 0;
                lowerDig[row+col] = 0;
            }
        } 
    }
    
    public List<String> construct(char[][] board){
        List<String> res = new LinkedList<String>();
        for(int i =0;i <board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
