package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class CountingMachineRevisited {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			int start;
			int end;
			int incr;
			int num;
			
			System.out.println("Start counting from: ");
			start = keyboard.nextInt();
			System.out.println("Stop Counting at: ");
			end = keyboard.nextInt();
			System.out.println("Count by increments of: ");
			incr = keyboard.nextInt();
			
			for (num = start; num<= end; num = num + incr) {
				System.out.print(num + " ");
				
			}
	}
}
