package com.ds.math;

public class primeNumber {

	public static void main(String[] args) {

		int n = 39601;
		boolean prime = true;

		if (n == 1) {
			System.out.println("It is not a prime number");
			return;
		}
		int count =0;
		for (int i = 2; i < squareroot(n); i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
			count++;
		}
		System.out.println(count);

		if (prime) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

		// System.out.println(squareroot(25));

	}

	public static int squareroot(int n) {
		int result = 1;

		for (int i = 1; i < n; i++) {
			if (i * i > n) {
				break;
			} else {
				result = i;
			}

		}

		return result;
	}
}
