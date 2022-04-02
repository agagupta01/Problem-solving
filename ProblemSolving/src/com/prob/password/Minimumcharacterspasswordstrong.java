package com.prob.password;

import java.util.regex.*;

public class Minimumcharacterspasswordstrong {

	
	// Function to count minimum
    // number of characters
    static int countCharacters(
        String password)
    {
 
        int count = 0;
 
        // Create the patterns to search digit,
        // upper case alphabet, lower case
        // alphabet and special character
        Pattern digit = Pattern.compile("(\\d)");
        Pattern upper = Pattern.compile("([A-Z])");
        Pattern lower = Pattern.compile("([a-z])");
        Pattern spChar = Pattern.compile("(\\W)");
 
        // Search the above patterns in password.
        Matcher Digit = digit.matcher(password);
        Matcher Upper = upper.matcher(password);
        Matcher Lower = lower.matcher(password);
        Matcher Special = spChar.matcher(password);
 
        // If no digits are present
        if (!Digit.find()) {
            count++;
        }
        // If no upper case alphabet is present
        if (!Upper.find()) {
            count++;
        }
        // If no lower case alphabet is present
        if (!Lower.find()) {
            count++;
        }
        // If no special character is is present
        if (!Special.find()) {
            count++;
        }
 
        // Check if the string length after adding
        // the required characters is less than 8
        if ((count + password.length()) < 8) {
 
            // Add the number of
            // characters to be added
            count = count + 8
                    - (count + password.length());
        }
 
        return count;
    }
 
    // Driver Code
    public static void main(String args[])
    {
 
        String password1 = "Geeksforgeeks";
        System.out.println(
            countCharacters(password1));
 
        String password2 = "Geeks1";
        System.out.println(
            countCharacters(password2));
    }
}
