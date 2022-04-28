package com.code.challenges;

public class factorial {

	public static void isFactorial(int number) {
		int cont = 1;
		if(number <= 0) {
			System.out.println("El numero debe ser mayor  0");
		}
		else {
			for(int i = 1; i <= number; i++) {
				cont *= i;
			}
		}
		System.out.println("El factorial de " + number + " es: " + cont);
		
	}
}
