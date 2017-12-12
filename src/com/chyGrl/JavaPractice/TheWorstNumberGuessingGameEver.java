package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class TheWorstNumberGuessingGameEver {
public static void main(String[] args) {
	int num, guess;
	num = 6;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to the worst Number Guessing game ever");
	System.out.println("I am thinking of a number from 1-20" + "\nTry to guess it!");
	guess = in.nextInt();
	
	if(guess == num) {
		System.out.println("I cant believe you guessed my number!! Cheater!");
		
		
	}
	else {
		System.out.println("Ha! NOPE! " + "\nThe number was 6, imbicile.");
		
	}
	
	
}
}
