package com.ds.string;

import java.util.ArrayList;

public class LPSValueForAnString {

	public static void main(String[] args) {

		String given = "aa";

		System.out.println(given.length());
		int LPS = 0;
		ArrayList<Integer> outputLPS = new ArrayList<>();

		if (given.length() == 1) {
			System.out.println(given);
			return;
		}

		for (int k = 0; k < given.length()-1; k++) {
			String input = given.substring(0, k);
			StringBuffer prefix = new StringBuffer();
			StringBuffer suffix = new StringBuffer();
		
			for (int i = 0, j = input.length() - 1; i < input.length() - 1; i++, j--) {
				prefix.append(input.charAt(i));
				System.out.println(prefix);
				suffix.insert(0, input.charAt(j));
				System.out.println(suffix);
				if (prefix.toString().equalsIgnoreCase(suffix.toString()))
					LPS = prefix.length();

			}
			outputLPS.add(LPS);

		}

		for(int i = 0 ; i < outputLPS.size() ; i++)
		System.out.println(outputLPS.get(i));
	}

}
