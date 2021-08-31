package com.ds.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		List<String> prime = new ArrayList<String>();
		prime.add("abhi");
		prioritizedOrders(6,prime);
	}
	
	static public List<String> prioritizedOrders(int numOrders, List<String> orderList) 
	{
		
		List<String> finall = new ArrayList<String>();
		Map<String,String> maptemp = new HashMap<String, String>();
		
	    List<String> prime = new ArrayList<String>();
	    List<String> nonprime = new ArrayList<String>();
	    for(String s : orderList){
	        String str = s.substring(s.indexOf(" "));
	        String strd [] = {};
	        if(str.matches(".*\\d.*")){
	        	nonprime.add(s);
	        } else {
	        	prime.add(s);
	        }
	    }
	    String temp;
	    Object[] names =  prime.toArray();
	    int n = names.length;
	    	for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (((String) names[i]).compareTo((String) names[j])>0) 
	                {
	                    temp = (String) names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	    }
	    	
	    	
	    	
		for(Object np :names) {
			finall.add((String) np);
		}
		finall.addAll(nonprime);
	   
		return finall;
	}
}
