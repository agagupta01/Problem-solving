package com.ds.math;


public class FindMissingNumber {

	public static void main(String[] args) {

		int [] inn = {301,302,303,304,305,306,307,308,303,305};
		int sum = 0,sum1 =0,fin =0;
		for(int i = 301;i <=310;i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		for(int i = 0;i < inn.length;i++) {
			sum1 = sum1 + inn[i];
		}
		
		System.out.println(sum1);
		
		System.out.println(sum-sum1);
	}

}
