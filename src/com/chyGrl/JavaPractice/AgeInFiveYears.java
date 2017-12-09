//Age in Five Years
//
//Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. 
//Then display what their age would be five years from now. 
//Then display what their age would be five years ago.

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Please enter your First and last name: ");
		name = keyboard.nextLine();
		
		System.out.print("Hello, " + name + ", how old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("Cool! Did you know in 5 years you will be " + (age+5)+ "?" + " But.... be in good spirit, you are just " + age + " :)");
		
		
		
	}

}
