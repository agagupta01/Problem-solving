package com.ds.string;

public class numberPalimdrom {

	public static void main(String[] args) {
		
		
		int x = 121;
		
		String s = String.valueOf(x);
		
		int n = s.length();
		
		String rev = reverse(s);
		
		
		
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("true"); 
		} else {
			System.out.println("false"); 
		}
	}
	
	public static String reverse(String str) {
		int n = str.length();
		String nstr = "";
		char ch;
		  for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
		return nstr;
	}
}
