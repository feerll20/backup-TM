package com.code.challenges;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		palindrome.isPalindrome("AniTa LaVa La... Tina!!");
		
//		armstrongNumber.isArmstrong(1634);
		
		
//		factorial.isFactorial(12);
		
		List<String> nameList  = new ArrayList<String>(List.of("Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert", "Connie"));
		System.out.println("Let's begin...");
		ListingNames.listOfNames(nameList);
        
	}

}
