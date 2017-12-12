package com.chyGrl.JavaPractice;

import java.util.Random;

//Dice
//Write a program that simulates a dice roll by picking a 
//random number from 1-6 and then picking a second random number from 1-6. 
//Add the two values together, and display the total.

public class Dice {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int dice1 = 1 + r.nextInt(6);
		System.out.println("First die count:" + dice1);
		int dice2 = 1 + r.nextInt(6);
		System.out.println("Second die count:" + dice2);
		
		System.out.println("Merged die count: " + dice1 + dice2 );
		
		
	}
}
