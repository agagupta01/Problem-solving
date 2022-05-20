package com.algo.recursion;


import java.util.ArrayList;
import java.util.List;

public class AllPermutationnOfString {

	public static void main(String[] args) {
		
		String s = "abce";
		List<String> res = new ArrayList<String>();

		char[] arr = s.toCharArray();

		recursion(0, arr, res);

		for (int i = 0; i < res.size(); i++)
			System.out.println(res.get(i));

	}

	public static void recursion(int index, char arr[], List<String> res) {

		if (index == arr.length) {
			String d = "";
			for (int i = 0; i < arr.length; i++) {
				d = d + arr[i];
			}
			res.add(d);
			return;
		}

		for (int i = index; i < arr.length; i++) {
			swap(arr, i, index);
			recursion(index + 1, arr, res);
			swap(arr, i, index);
		}
}

public static void swap(char arr[], int i, int j) {
	char t = arr[i];
	arr[i] = arr[j];
	arr[j] = t;
}
}
