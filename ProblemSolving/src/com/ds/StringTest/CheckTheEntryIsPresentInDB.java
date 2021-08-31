package com.ds.StringTest;

import java.util.*;

public class CheckTheEntryIsPresentInDB {

	public static void main(String[] args) {
		String [] str = {"Abhi","rani","vinni","Abhi","vinni","avi"};
		
		
		for(String s : strExistInDB(str.length,str)) {
			System.out.print(s  + " ");
		}

	}

	
	public static String[] strExistInDB(int N,String[] str) {
		String[] result = new String[N];
		
		TreeSet<String> tr = new TreeSet<>();
		
		for(int i =0; i < str.length; i ++) {
			if(tr.add(str[i])) {
				result[i] = "NO";
			} else {
				result[i] = "YES";
			}
		}
		
		return result;
	}
}
