package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class TenTimes {
	public static void main(String[] args) {
		String message;

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Type a message and I'll print it 10 times!");
	message = keyboard.nextLine();

	for(int i = 0; i<10; i++) {
		
		System.out.println(message);
	}
	
	
	}

}
