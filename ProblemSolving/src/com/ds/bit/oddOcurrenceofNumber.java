package com.ds.bit;

public class oddOcurrenceofNumber {

	public static void main(String[] args) {
		
		int arr[] = { 12, 12, 14, 90, 14, 14, 14 };
	    //int n = sizeof(arr) / sizeof(arr[0]);
	   System.out.println("The odd occurring element is %d " + 
	           findOdd(arr, arr.length));
	    
	}
	
	public static int findOdd(int arr[], int n)
	{
	    int res = 0, i;
	    for (i = 0; i < n; i++)
	        res ^= arr[i];
	    return res;
	}
}
