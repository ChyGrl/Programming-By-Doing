//How Old Are You?
//
//Make a program which displays a different message depending on the age given. Here are the possible responses:
//
//age is less than 16, say "You can't drive."
//age is less than 18, say "You can't vote."
//age is less than 25, say "You can't rent a car."
//age is 25 or over, say "You can do anything that's legal."

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class HowOldAreYou {
	public static void main(String[] args) {

		int age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome, Human. How old are you? " );
		age = keyboard.nextInt();
		
		if(age<16) {
			System.out.println("You can't drive.");
			
		}
		if(age<18) {
			
			System.out.println("You can't vote.");
		}
		if(age<25) {
			System.out.println("You can't rent a car.");
			
		}
		else {
			System.out.println("You can do anthing that is legal.");
		}
		
	}
}
