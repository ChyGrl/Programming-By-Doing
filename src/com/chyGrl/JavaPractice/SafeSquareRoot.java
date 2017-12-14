package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		int num;
		
		
		System.out.println("Square Rooter" + 
				"\nEnter a number:");
		
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		double sR = Math.sqrt(num);
		
		while(num <=0) {
			System.out.println("Hey positive numbers only, You!" + " Try again");
			num = keyboard.nextInt();
			sR = Math.sqrt(num);
		}

		System.out.println("The square root of your number: " + num + " is: " + sR );
		
	}

}
