package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class AddingValuesWithForLoop {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		int num = keyboard.nextInt();
		int sum = 0;
		
		
		for(int n = 0; n <= num; n++) {
			System.out.print(n + " ");
			sum = sum + n ;
			
			
		}
		System.out.println("The sum is: " + sum);
	}

}
