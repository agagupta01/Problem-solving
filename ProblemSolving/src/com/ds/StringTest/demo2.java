package com.ds.StringTest;

import java.util.*;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean result = false;
		String sl1 = in.nextLine();
		String s2 = in.nextLine();

		temp t = new temp();
		List<String> str = t.printPermutn(sl1, "");

		System.out.println(str);
		for(String s1 : str) {
			for (int i = 0; i < s1.length() -1 ; i++) {
				if ((int) s1.charAt(i) < (int) s2.charAt(i)) {
					result = true;
				}
			}
	
			if (!result) {
				for (int i = 1; i <= s1.length(); i++) {
					if ((int) s1.charAt(i) > (int) s2.charAt(i)) {
						result = true;
					}
				}
			} else {
				break;
			}
		}

		System.out.print(result);

	}
}

class temp {
	List<String> s;

	temp() {
		s = new ArrayList<String>();
	}

	List<String> printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			s.add(ans + " ");
			return s;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);
		}

		return s;
	}
}
