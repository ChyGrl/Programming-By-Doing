package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double x, sum;
		x=0;
		sum=0;
		System.out.println("Im an adder.. give me any two numbers Ill give you the sum.");
		System.out.println("Number: " );
		x = keyboard.nextDouble();
		while(x!=0) {
			sum = x + sum;
			System.out.println("The total so far is " + sum + ".");
			System.out.println("Number: ");
			x = keyboard.nextDouble();
		}
		System.out.println("\nThe total is " + sum +"." );
	}
	
}
