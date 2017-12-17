package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class LetterAtATme {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your message: ");
		String message = keyboard.nextLine();
	
	
		System.out.println("Your message is " + message.length()+ "characters long");
		System.out.println("the first character starts at 0 position ans is'"+ message.charAt(0));
		int finalPos = message.length() -1;
		System.out.println("The last character is at position" + finalPos + "and is ' "+ message.charAt(finalPos) + "'." );
		System.out.println("\n Here are the characters that make up your message:\n");
		
		for (int i = 0; i < message.length(); i++) {
		
		System.out.println("\t" + i + "-'" + message.charAt(i) + "'");
	}
		int a_count = 0;
		for ( int i=0; i < message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' )
			{
				a_count++;
			}
		}

		System.out.println("\nYour message contains a vowel " + a_count + " times. Isn't that interesting?");

	}
	}
	

