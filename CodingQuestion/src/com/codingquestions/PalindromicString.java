package com.codingquestions;

public class PalindromicString {

	 public static String smallestPalindromicString(int K) {
	        StringBuilder result = new StringBuilder();
	        char currentChar = 'a';

	        while (K > 0) {
	            int x = 1;

	            // Find the largest x such that x*(x+1)/2 <= K
	            while ((x + 1) * (x + 2) / 2 <= K) {
	                x++;        
	            }

	            // Append currentChar x times
	            for (int i = 0; i < x; i++) {
	                result.append(currentChar);   
	            }

	            // Subtract the number of palindromic substrings contributed by this sequence
	            K -= x * (x + 1) / 2;      
                   
	            // Move to the next lexicographically larger character
	            currentChar++;    
	        }

	        return result.toString();  
	    }

	    public static void main(String[] args) {
	        int K = 4;  // Change this value to test different inputs
	        String ans = smallestPalindromicString(K);
	        System.out.println("Lexicographically smallest string with " + K + " palindromic substrings: " + ans);
	    }

}
