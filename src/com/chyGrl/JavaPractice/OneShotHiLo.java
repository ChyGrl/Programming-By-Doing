package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

//One Shot HiLo
//Write a program that picks a random number from 1-100. 
//Give the user a chance to guess it. If they get it right, tell them so. 
//If their guess is higher than the number, say "Too high." 
//If their guess is lower than the number, say "Too low." 
//Then quit. (They don't get any more guesses for now.)


public class OneShotHiLo {
	public static void main(String[] args) {
		
		int guess;
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		guess = keyboard.nextInt();
		
		int rando = 1 + r.nextInt(100);
		
		System.out.println(rando);
		
		if (guess< rando) {
			System.out.println("So slow...Too low");
			
		}
		else if (guess > rando) {
			
			System.out.println("You lie, Too high");
		}
		else {
			System.out.println("You guessed it");
		}				
	}

}
