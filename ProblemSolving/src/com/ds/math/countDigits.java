package com.ds.math;

public class countDigits {

	public static void main(String[] args) {

		long i = 234566998;
		long j = 0, k = 0;

		while (i > 0) {
			k = k + i % 10;
			System.out.println(k);
			j++;
			i = i / 10;
			System.out.println(i);
		}

	}

}
