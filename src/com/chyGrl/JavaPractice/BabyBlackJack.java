package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class BabyBlackJack {
	public static void main(String[] args) {
		Random rando = new Random();
		Scanner kB = new Scanner(System.in);
		
		int p1 = 1 + rando.nextInt(10);
		int p2 = 1 + rando.nextInt(10);
		int d1 = 1 + rando.nextInt(10);
		int d2 = 1 + rando.nextInt(10);
		int pTotal = p1 + p2;
		int dTotal = d1 + d2;
		String name;

		
		System.out.println("::Baby BlackJack::");
		System.out.println("Player 1, Please enter your name: ");
		name = kB.nextLine();
		System.out.println("Welcome to BabyBlackJack.");
		
		System.out.println(name+ "'s, hand contains " + p1 + " & "  + p2 );
		System.out.println("Dealer hand: " + d1 +" & " + d2);
		if (pTotal > dTotal)
		{
			System.out.println("Congrats " + name + ", You win!" );
		}
		else {
			System.out.println("Dealer Wins");
		}
	}
}
