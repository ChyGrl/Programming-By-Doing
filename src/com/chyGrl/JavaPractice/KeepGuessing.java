package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

//Keep Guessing
//
//Modify your previous number-guessing game so that they can guess until they get it right. 
//That means it will keep looping as long as the guess is different from the secret number. 
//Use a while loop.

public class KeepGuessing {
	public static void main(String[] args) {
		int guess;
		Random r = new Random();

		int num = 1 + r.nextInt(10);
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to my Number Guessing game");
		System.out.println("I am thinking of a number from 1-10" + "\nTry to guess it!");
		guess = in.nextInt();

		while (guess != num) {
			System.out.println("Ha! NOPE! "	+"\nTry again:");
			guess = in.nextInt();
			
		if(guess == num)  {
			System.out.println("I cant believe you guessed my number!! Cheater!");

		}

	
	
	
	
	}
}
}