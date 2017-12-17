package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class CountingMachine {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			int num;
			
			System.out.println("Please input a number:  \t" );
			num = keyboard.nextInt();
			
			for(int n = 0; n <= num; n++) {
				System.out.println(n + "  ");
				
			}
			
	}
}
