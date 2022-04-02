package com.ds.TwoDArray;

import java.util.Scanner;

public class zigzagprint {


	
	public static void main(String args []){
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int b = s.nextInt();
	    printGridSequencesForZigzagPattern(a,b);
	}

	       /* 1    2   3   4   5
	        6    7   8   9   10
	        11   12  13  14  15
	        16  17  18   19  20
	        21  22  23   24  25
	        
	        1 2 3 4 5 10 15 14 13 12 11 16 21 22 23 24 25*/


	public static void printGridSequencesForZigzagPattern(int row,int col){
	    
	    int [][] input = new int [row][col];
	    int count = 1;
	    for(int i =0;i < row;i++){
	        for(int j =0;j < col;j++){
	            input[i][j] = count;
	            count++;
	        }
	    }
	    
	    for(int i =0;i < row;i++){
	        for(int j =0;j < col;j++){
	            System.out.print(input[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    
	    int evenRow = 0; //starts from the first row
        int oddRow = 1; //starts from the next row
        
        boolean leftToRight = true;
        boolean lasttofirst = true;
  
        while (evenRow<row) 
        {
        	if(leftToRight) {
	            for (int i=0;i<col;i++)
	            {
	                // evenRow will be printed
	                        // in the same direction
	            	System.out.print(input[evenRow][i] + " "); 
	            }
        	} else {
        		for (int i=col-1;i>=0;i--)
	            {
        			System.out.print(input[evenRow][i] + " "); 
	            }
	            
        	}
              
            // Skipping next row so as
                // to get the next evenRow
            evenRow = evenRow + 2; 
              
            if(oddRow < row)
            {
                if(lasttofirst) {
                	System.out.print(input[oddRow][col-1] +  " "); 
                } else {
                	System.out.print(input[oddRow][0] +  " "); 
                }
            }
          
            // Skipping next row so as 
                // to get the next oddRow
            oddRow = oddRow + 2; 
            
            leftToRight = !leftToRight;
            lasttofirst = !lasttofirst;
            
        } 
	}
}
