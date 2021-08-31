package com.ds.array;

import java.util.*;

public class MaxSumContiguousSubArray {

	public static void main(String[] args) {

		
		//O(n^2)
		// int[] test = new int[10];

		/*
		 * int max = 0, temp = 0;
		 * 
		 * // int[] test = {1,2,3,4,-10};
		 * 
		 * List<Integer> l = Arrays.asList(-2,1,-3,4 ,-1,2,1,-5,4);
		 * 
		 * // int[] test = {-2,1,-3,4 ,-1,2,1,-5,4};
		 * 
		 * for (int i = 0; i < l.size(); i++) {
		 * 
		 * for (int j = i; j < l.size(); j++) { temp = temp + l.get(j); if (temp > max)
		 * { max = temp; } } temp = 0; }
		 * 
		 * System.out.println(max);
		 */
		
		
		
		
		//O(n) kadane algorithms
		
		 int[] test = {-2,1,-3,4 ,-1,2,1,-5,4};
		
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i =0;i < test.length ;i++) {
			
			
			currentSum = Math.max(test[i],currentSum+test[i]);
			maxSum = Math.max(maxSum,currentSum);
			
		}
		
		
		System.out.println(maxSum);
		
		

	}

}
