package com.ds.StringTest;

import java.util.*;

public class temp3 {

	
	
	public static void main(String[] args) {
		
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		
		a.add("jk");
		b.add("kj");
		getMinimumDifference(a,b);
		
		
		
	}
	
	
	public static String reveser(String text){ 
	    StringBuilder sb = new StringBuilder(); 
	    char[] contents = text.toCharArray(); 
	    for(int i = text.length() -1; i>=0 ; i--)
	    { 
	        sb.append(contents[i]); 
	    } 
	    String reversed = sb.toString(); 
	    return reversed;
	    }



	public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
	    // Write your code here
	    List<Integer> resultList = new ArrayList<>();
	    for(int i =0 ;i < a.size() ;  i++){
	        if(a.get(i).length() != b.get(i).length()){
	            resultList.add(i, -1);
	        } else {

	            String a_str = a.get(i);
	            String b_str = b.get(i);
	            
	            if(reveser(a_str).equals(b_str)){
	                resultList.add(i,0);
	                continue;
	            }
	            int sub = b_str.charAt(0) - a_str.charAt(0) ;
	            resultList.add(i,sub);
	            
	        }
	    }
	    return resultList;
	    }

	

}
