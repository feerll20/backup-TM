package com.code.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IllegalFormatWidthException;
import java.util.Map;
import java.util.Set;

public class uniqeCharacters {
	public static void countCharacter(String str) {
		Set<Character> strSet = new HashSet<Character>();
		String baseStr = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			strSet.add(str.charAt(i));
		}
		for(char element : strSet) {
			baseStr += element;
		}
		System.out.println(baseStr);
		for(int x = 0; x < baseStr.length(); x++) {
			for(int y = 0; y < str.length(); y++) {
				if(baseStr.charAt(x) == str.charAt(y)) {
					count++;
				}
			}
			System.out.println(baseStr.charAt(x) + ": " + count);
			count = 0;
		}		
		
		Map<Integer, String> mapData = new HashMap<Integer, String>();
		for(Integer a = 0; a < str.length(); a++){
			mapData.put(a, "string" + a);
		}
		for(Integer key : mapData.keySet()){
			if(key % 2 == 0) {
				System.out.println("Thi is the value: ");
				System.out.println(mapData.get(key));
			}
		}
	}
}
