package com.ds.math;

public class factorialOfNumber {

	public static void main(String[] args) {
		int n =100000,j=0;
		int[] output = new int[n/2];
		for(int i = 1;i < n;i++ ) {
			if(n%i==0) {
				output[j]= i;
				System.out.println(i);
				j++;
			}
		}
		
		System.out.println(output);
	}
}
