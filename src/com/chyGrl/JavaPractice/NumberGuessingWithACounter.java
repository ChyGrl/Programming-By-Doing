package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {

	public static void main(String[] args) {
		
		int guess;
		Random r = new Random();

		int num = 1 + r.nextInt(10);
		Scanner in = new Scanner(System.in);
		int count = 0;

		System.out.println("Welcome to my Number Guessing game");
		System.out.println("I am thinking of a number from 1-10" + "\nTry to guess it!");
		guess = in.nextInt();

		if (guess == num) {
			System.out.println("I cant believe you guessed my number!! Cheater!" + "It only took you " + " tries");
			count++;
		} else {
			System.out.println("Ha! NOPE! ");

		}
		
	}
	
	
}
