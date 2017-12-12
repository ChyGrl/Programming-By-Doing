package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Random rando = new Random();
		
		int number = 1 + rando.nextInt(100);
		
		System.out.println("Im thinking of a number between 1 -100... you only have 7 guesses.");
		System.out.println("First guess: ");
		int guess = in.nextInt();
		int count = 1;
		
		
	while (number != guess && count<7 ) {
		if(guess > number) {
			
			System.out.println("Too high!");
		}
		if(guess<number) {
			System.out.println("Too low!");
		}
		count++;
		
		System.out.println("Guess # " + count + ":");
		guess = in.nextInt();
	}
		if(guess != number) {
			System.out.println("Sorry.. 7 tries and you still didnt guess correctly");
		}
		if(guess == number) {
			System.out.println("WOW! You sure are a smart cookie!");
		}
	}
	
	
}
