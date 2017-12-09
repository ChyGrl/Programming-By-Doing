package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class AskingQuestions {
	public static void main(String[] args) {
		//Change the program so that it reads in the height in two parts. 
		//The first part should read in an int for the number of feet. 
		//Then read in a second int for the number of inches. 
		//Try to make the output look the same, though.

		Scanner keyboard = new Scanner(System.in);

		int age;
		String heightFT;
		String heightIN;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		heightFT = keyboard.next();
		
		System.out.print( "How many inches tall are you? " );
		heightIN = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + heightFT + " feet "+ heightIN + " inches tall and " + weight + "lbs heavy." );
	}

}
