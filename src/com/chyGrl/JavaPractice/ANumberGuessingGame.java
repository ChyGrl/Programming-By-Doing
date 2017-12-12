package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
	public static void main(String[] args) {
		int guess, num;
		int count =1;
		Random r = new Random();

		num = 1 + r.nextInt(10);
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to my Number Guessing game");
		System.out.println("I am thinking of a number from 1-10" + "\nTry to guess it!");
		guess = in.nextInt();
		
		count = 1;
		while (guess != num) {
			System.out.println("Ha! NOPE! ");
			guess=in.nextInt();
			count++;

		}
		System.out.println("I cant believe you guessed my number!! Cheater!" + "\n It took you " + count + " tries to guess correctly.");
	}

}
