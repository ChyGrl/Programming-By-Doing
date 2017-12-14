package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class AgainWiththeGuessingGame {

	public static void main(String[] args) {
		int guess;
		Random rand = new Random();
		int count = 0;
		
		int num = 1 + rand.nextInt(10);
		Scanner in = new Scanner(System.in);

		System.out.println("Guessing Stuff Again, are we?");
		System.out.println("Thinking of a number between 1-10" + "\nGuess it, will ya?");
		guess = in.nextInt();

		do {
			System.out.println("Ha Nope!" + "\nTry Again silly human...");
			guess = in.nextInt();
			count++;
		} while (guess != num);
		if (guess == num) {
			System.out.println("I cant believe you guessed my number!! Cheater!" + "It only took you " + count +" tries to guess it.");

		}

	}

}
