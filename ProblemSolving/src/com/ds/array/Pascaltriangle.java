package com.ds.array;

import java.util.*;

class Pascaltriangle {
    public static List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	List<Integer> row = null,prev = null;
        
        for(int i = 0; i < numRows;i++){
            row = new ArrayList<Integer>();
            for(int j = 0 ; j <= i ;j++){
                if(j == i || j == 0){
                    row.add(1);
                } else {
                    row.add(prev.get(j-1) + prev.get(j));
                }
            }
            ans.add((ArrayList<Integer>) row);
            prev = row;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
    	ans = generate(5);
    	
    	for(List<Integer> its : ans) {
    		
    		System.out.println(its);
    	}
	}
}