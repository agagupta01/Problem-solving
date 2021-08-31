package com.ds.math;

public class ispalindrome {
public static void main(String[] args) {
	String s = "A man, a plan, a canal: Panama";
	System.out.println(ispalindrome(s));
	
}

public static int ispalindrome(String s) {

	
	if(s.length() <=1 ) return 1;
	
	int st =0,en = s.length()-1;
	while(st < en) {
		while(st < en && !Character.isLetterOrDigit(s.charAt(st))) {
			st++;
		}
		while(st < en &&  !Character.isLetterOrDigit(s.charAt(en))) {
			en--;
		}
		
		if(st < en && 
				 Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(en))) {
			return 0;
		}
		st++;
		en--;
	}
	
	return 1;
}
}
