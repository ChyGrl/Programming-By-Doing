package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class CountingWithAForLoop {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Type in a message and I'll didplay it five times");
			System.out.print("Message:");
			String message = keyboard.nextLine();
			
			
			//This executes the code inside the curly brackets the states amount of instances
			for (int n = 1; n <= 5; n = n+1) {
				
				System.out.println(n + ". " + message);
				
				
			}
	}	
}
