package com.goldman.prob;

import java.util.ArrayList;

public class ElectionProblem {

	public static void main(String[] args) {
		System.out.println(whoIsElected(100,2));
		
	}
	
	 public static int whoIsElected(int n, int k) {
		    ArrayList<Integer> inputArr = new ArrayList<Integer>();
		    for(int a = 1;a <=n;a++)
		        inputArr.add(a);
		    
		    int i =0;
		    while(inputArr.size() > 1){
		      if(i+k-1 < inputArr.size()){
		    	  System.out.println("Removed elemnety is : "+ inputArr.remove(i+k-1));
		        i = i+k-1;
		      } else {
		        i = 0;
		        System.out.println("Remaining llist ");
		        for(int a = 0;a <inputArr.size();a++)
		        	System.out.print(inputArr.get(a) + " ");
		        System.out.println();
		      }
		      
		    }
		    
		    return inputArr.get(0);

	 }
}
// 1,3,5,7,8,9,10