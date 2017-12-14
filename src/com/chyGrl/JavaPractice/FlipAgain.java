package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();
		
		String flipAgain;
		String coin;
		do {
			
			int flip = rando.nextInt(2);
			if(flip ==1)
				
				coin = "HEADS";
			else coin = "TAILS";
		System.out.println("You flipped a coin and it is: "+ coin);
			System.out.println("Flip agian? ");
			flipAgain = keyboard.next();
			
		
	}
		while(flipAgain.equals("y"));
}}
