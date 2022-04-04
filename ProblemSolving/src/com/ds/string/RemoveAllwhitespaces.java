package com.ds.string;

public class RemoveAllwhitespaces {

	
	public static void main(String[] args) {
		String s = " i am abhishek";
		
		StringBuffer st = new StringBuffer();
		String sts = "";
		
		char[] sarr = s.toCharArray();
		for(int i =0;i < s.length();i++) {
			if(sarr[i] != ' ')
				sts += sarr[i];
		}
		
		
		
		
		String sp = "a";
		
		
		
		System.out.println(sp);
		//System.out.println(st.toString());
	}
}
