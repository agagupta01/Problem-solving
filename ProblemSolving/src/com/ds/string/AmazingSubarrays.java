package com.ds.string;

public class AmazingSubarrays {

	public static void main(String[] args) {
		
		System.out.println(solve("ABEC"));
	}
	
	 public static  int solve(String A) {


	        long n = A.length();
	        int t =0;
	        for(int i =0 ;i < n ;i++){
	            if(A.charAt(i)=='A' ||A.charAt(i)=='E' || A.charAt(i)=='I' ||A.charAt(i)=='O' ||A.charAt(i)=='U' 
	            ||A.charAt(i)=='a' ||A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' ||A.charAt(i)=='u' ){
	                t+=n-i;
	            }
	        }

	        return t%10003;
	    }
}
