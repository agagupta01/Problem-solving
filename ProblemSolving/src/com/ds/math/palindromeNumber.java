package com.ds.math;

public class palindromeNumber {

	public static void main(String[] args) {
		
		
		//int[] input = {1,2,3,4,5,3,2,1};
		
		int guess = 12321;
		
		String temp = Integer.toString(guess);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		    System.out.println(newGuess[i]);
		}
		
		
		
		boolean palindrom = true;
		
		for(int i =0,j= newGuess.length-1; i < newGuess.length;i++,j--) {
			
			if(temp.substring(i,i).equalsIgnoreCase(temp.substring(j,j))) {
				palindrom = false;
				break;
			}
		}
		
		
		if(palindrom) {
		
		System.out.println("palindrom number");
		} else {
			System.out.println("Not a palindrom number");
		}
	}
}
