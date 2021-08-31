package com.ds.math;

public class FindPrimeFactors {

	public static void main(String[] args) {

		int n = 100000, j = 0;
		int[] output = new int[n / 2];
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				if (isPrime(i)) {
					output[j] = i;
					System.out.println(i);
					j++;
				}
			}
		}

		System.out.println(output);
	}

	public static boolean isPrime(int n) {
		boolean prime = true;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}
}
