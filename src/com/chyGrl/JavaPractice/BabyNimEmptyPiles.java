package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class BabyNimEmptyPiles {

	public static void main(String[] args) {

		Random rando = new Random();
		int many, times = 2;

		String choice;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Lets play Rando!" + "\n2 Players: Please Enter your names");
		System.out.println("Player 1: ");
		String player1 = keyboard.next();

		System.out.println("Player 2: ");
		String player2 = keyboard.next();

		System.out.println("Game initiated" + "\nPlayer 1: " + player1 + "\nPlayer 2: " + player2);

		int a = 1 + rando.nextInt(5);
		int b = 1 + rando.nextInt(5);
		int c = 1 + rando.nextInt(5);

		String name = player1;

		while (a != 0 || b != 0 || c != 0) {

			System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
			System.out.println();

			if (times % 2 == 0) {
				name = player1;
			} else {
				name = player2;
			}

			System.out.print(name + ", choose a pile: ");
			choice = keyboard.next();
			System.out.print("How many to remove from from pile " + choice + ": ");
			many = keyboard.nextInt();
			System.out.println();

			if (choice.equals("a") || choice.equals("A")) {

				while (many > a || many < 1) {
					System.out.print("Nice try, " + name + ". Choose again: ");
					many = keyboard.nextInt();
					System.out.println();
				}

				a -= many;

			} else if (choice.equals("b") || choice.equals("B")) {

				while (many > b || many < 1) {
					System.out.print("Nice try, " + name + ".  Choose again: ");
					many = keyboard.nextInt();
					System.out.println();
				}

				b -= many;

			} else if (choice.equals("c") || choice.equals("C")) {

				while (many > c || many < 1) {
					System.out.print("Nice try, " + name + ".  Choose again: ");
					many = keyboard.nextInt();
					System.out.println();
				}

				c -= many;

			} else {
				System.out.println("You did it wrong, so you forfeit your turn.");
			}

			times += 1;
		}

		if (name == player1) {
			name = player2;
		} else {
			name = player1;
		}

		System.out.println();
		System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
		System.out.println();
		System.out.println(name + ", WINS!");
		System.out.println();

	}
}