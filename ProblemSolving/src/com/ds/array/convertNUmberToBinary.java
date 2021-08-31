package com.ds.array;

public class convertNUmberToBinary {

	public static void main(String[] args) {
		int n = 8;
		
		 StringBuffer ans = new StringBuffer();
		 
		 while(n>1) {
		 ans.append(n%2);
		 n = n/2;
		 }
		 
		 if(n==1) {
			 ans.append("1");
		 }
		 

	    System.out.println( ans.reverse());
	}
	
}
