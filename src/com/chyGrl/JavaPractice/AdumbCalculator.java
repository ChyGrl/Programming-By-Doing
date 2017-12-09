//A Dumb Calculator
//
//Make a simple numeric calculator. 
//It should prompt the user for three numbers. 
//Then add the numbers together and divide by 2. 
//Display the result. 
//Your program must support numbers with decimals, 
//not just integers.


package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class AdumbCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, num3, num4;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		num1 = keyboard.nextDouble();
		
		System.out.println("Please enter second number: ");
		num2 = keyboard.nextDouble();
		
		System.out.println("Please enter third number: ");
		num3 = keyboard.nextDouble();
		
		num4 = ((num1 + num2 + num3) / 2);
			
		
		System.out.println("Here is the sum of your three numbers divided by two: " + num4 );
		
	}

}
