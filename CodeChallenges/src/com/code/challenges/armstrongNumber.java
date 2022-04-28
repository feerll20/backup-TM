package com.code.challenges;

import javax.sound.midi.Soundbank;

public class armstrongNumber {
	public static void isArmstrong(int number) {
		String str = Integer.toString(number);
		int digit; 
		int armNumber = 0;
		for(int i = 0; i < str.length(); i++) {
			digit = Character.getNumericValue(str.charAt(i));
			armNumber += Math.pow(digit, str.length());
		}
		if(armNumber == number) {
			System.out.println("El numero SI es ARMSTRONG");
		}
		else {
			System.out.println("El numero NO es ARMSTRONG");
		}
	}

}
