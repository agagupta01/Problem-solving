package com.ds.string;

public class RemoveAllwhitespaces {

	
	public static void main(String[] args) {
		String s = " i am abbhishek";
		
		StringBuffer st = new StringBuffer();
		String sts = "";
		
		char[] sarr = s.toCharArray();
		for(int i =0;i < s.length();i++) {
			if(sarr[i] != ' ')
				sts += sarr[i];
		}
		
		
		System.out.println(sts);
		//System.out.println(st.toString());
	}
}
