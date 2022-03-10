package com.ds.string;

public class uniqueCharaterInString {
	
	
	public static void main(String[] args) {
		String s = "bd";
		System.out.println(firstUniqChar(s));
		
	}
	
	public static int firstUniqChar(String str)
    {
        char count [] = new char[256];
        for(int i = 0; i < str.length();i++){
            count[str.charAt(i)]++;
        }
        int index = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

}
