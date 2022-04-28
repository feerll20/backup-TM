package com.code.challenges;

public class palindrome {
	
	public static boolean isPalindrome(String word) {
		String reverseWord = "";
		if(word.equals(null) || word.length() <= 2) {
			System.out.println("PLEASE ENTER A WORD TO VALIDATE IF IS A PALINDROME!!");
		}
		else {
			word = word.toLowerCase().replaceAll("[^a-z0-9]", "");
			System.out.println(word);
			for(int i = word.length()-1; i >= 0; i--) {
				reverseWord += word.charAt(i);
			}
		}
		System.out.println(reverseWord);
		if(reverseWord.equals(word)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
