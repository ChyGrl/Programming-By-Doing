package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {

		int num;
		
		System.out.println("Please enter a number: ");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();
		
		
		while(num != 1) {
		
			if (num % 2 == 0) {
			num = num / 2;
		
			
		}
			else if(num % 2 !=0) {
			
				num = (num * 3) +1;
			
			}		
			
			System.out.println("\n"+ num);
			}
			
		}	
			
		
	}

