package com.ds.array;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,List<Integer>> ansMap = new HashMap<Integer,List<Integer>>();
        int max = 0,temp =0;
        for(int i =0 ; i < A.size()-1; i++){
            for(int j =i ;i < A.size()-1;j++){
                temp = temp + A.get(j);
                if(max < temp){
                    max = temp;
                    ans.add(A.get(j));
                } else {
                    ansMap.put(max,ans);
                    break;
                }
            }
            max =0;
            ans.clear();
        }

   
        max = 0;
        
        for (Integer name : ansMap.keySet()) {
        	if(max < name) {
        		max = name;
        	}
        }
        return (ArrayList<Integer>) ansMap.get(max);
    }
    
    public static void main(String[] args) {
		
    	ArrayList<Integer> input = new ArrayList<>();
    	input.add(1);
    	input.add(2);
    	input.add(5);
    	input.add(-7);
    	input.add(2);
    	input.add(3);
    	System.out.println(maxset(input));
	}
}

