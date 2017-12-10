package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) {
		String type, size, guess;
		
		
		System.out.println("Lets play a game of 2 questions!"+ "\nThink of an object and I will guess it");
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n Question 1) Is it an animal, vegetable, or mineral? ");
		type = in.next();
		
		Scanner into = new Scanner(System.in);
		
		System.out.println("\n Question 2) Is it bigger than a breadbox? ");
		size = into.nextLine();
		
		if(type.equalsIgnoreCase("animal")){
			guess = "squirrel";
		}
		if(size.equalsIgnoreCase("no")) {
		}else   {
			guess = "moose";
		}
		 if(type.equalsIgnoreCase("vegetable")) {
			
			if(size.equalsIgnoreCase("no")) {
				guess= "carrot";
			}else {
				guess = "watermelon";
			}

		} else if (type.equalsIgnoreCase("mineral")) {
            if (size.equalsIgnoreCase("no")) {
                guess = "paper clip";
            } else {
                guess = "Camaro";
            }
            if(guess == "") {
            	System.out.println("Not valid. Try again");
            }
            else {
            	System.out.println("I think you are thinkng of a... " + guess);
            	System.out.println("I would ask if that's right but i care not, feeble human.");
            }
		}}}

