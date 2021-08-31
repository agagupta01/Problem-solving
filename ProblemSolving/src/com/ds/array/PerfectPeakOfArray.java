package com.ds.array;

public class PerfectPeakOfArray {

	public static void main(String[] args) {

		int[] A = {1, 2, 3, 4, 5, 4, 3, 2, 3, 10 };
		System.out.println(perfectPeak(A));
	}

	//working for all examples
	public static int perfectPeak(int[] A) {
		int result = 0;

		int n = A.length;
		int[] mx = new int[n];

		int[] mn = new int[n];

		mx[0] = A[0];
		mn[n - 1] = A[n - 1];
		int max = A[0], min = A[n - 1];

		for (int i = 0; i < n; i++) {
			if(max == A[i]) {
				mx[i] = Integer.MIN_VALUE;
			} else {
				max = Math.max(max, A[i]);
				mx[i] = max;
			}
		}

		for (int j = n - 2; j >= 0; j--) {
			if(min == A[j]) {
				mn[j] = Integer.MAX_VALUE;
			}else {
				min = Math.min(min, A[j]);
				mn[j] = min;
			}
		}

		for (int k = 1; k < n - 1; k++) {
			if (mx[k] == mn[k] && mn[k] == A[k]) {
				System.out.println(A[k]);
				result = 1;
			}
		}
		return result;
	}

	public static int perfectPeak1(int[] A) {

		int result = 1,result1=1,result2=1;
		int first = 0, second = 0;
		for (int i = 1; i < A.length; i++) {
			int n = A[i];
			for (int j = 0; j < i - 1; j++) {
				if (A[j] >= n) {
					result1 = 0;
					break;
				}
				
			}

			for (int j = i + 1; j < A.length; j++) {
				if (A[j] <= n) {
					result2 = 0;
					break;
				}
				
			}
			if(result1 ==1 && result2 == 1) {
				
				System.out.println(n);
				break;
			}
		}

		if(result1 ==0 || result2 == 0) result = 0;
		return result;
	}
}
