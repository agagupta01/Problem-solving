package com.ds.StringTest;

import java.util.*;

public class FindKthSub_String {

	public static void main(String[] args) {
		
		String str = "abc"; 
        int k = 4; 
        int n = str.length(); 
  
        Printksubstring(str, n, k); 
	}
	
	public static void Printksubstring(String str,int n ,int k) {
		List<String> result = new ArrayList<>();
		for(int i = 0; i < str.length() ;i++) {
			for(int j = i + 1 ;  j <= str.length() ; j++) {
				result.add(str.substring(i,j));
			}
			
			
		}
		
		System.out.println(result);
		System.out.println(result.get(k-1));
	}
}
