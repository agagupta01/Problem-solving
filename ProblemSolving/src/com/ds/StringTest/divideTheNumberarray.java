package com.ds.StringTest;

public class divideTheNumberarray {

	public static void main(String[] args) {
		int N = 10;
		int K = 10;
		int S = 5;
		String Str = "1234567891";
		
		int numOfCharArray = N/S;
		
		String resultStr[] = new String[numOfCharArray];
		
		String temp;
		int j =0;
		for(int i = 0 ; i < N ; i = i + S) {
			temp = Str.substring(i, S+i);
			resultStr[j] = temp;
			j++;
			
		}
		
		
		for(String s : resultStr) {
			System.out.println(s);
		}
	
		String finalResult [] = new String[S * S];
		
			String t = resultStr[0];
			String t2 = resultStr[1];
			int h =0;
			for(int i = 0; i < t.length() ; i ++) {
				for(int k =0 ; k < t2.length(); k++) {
					
					finalResult[h] = t.charAt(i)+""+t2.charAt(k);
					h++;
				}
			}
		
			System.out.println(finalResult[K-2]);
		
	}
}
