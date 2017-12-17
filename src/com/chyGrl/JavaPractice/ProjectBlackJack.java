package com.chyGrl.JavaPractice;

import java.util.Random;
import java.util.Scanner;

public class ProjectBlackJack {
	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		Random rando = new Random(); 
		
		
		int p1, p2, d1, d2, pTotal, dTotal, card;
		String plaChoice = "hit";
		
		System.out.println("Welcome to BlackJack");
		
		p1 = 2 + rando.nextInt(10);
		p2 = 2 + rando.nextInt(10);
		d1 = 2 + rando.nextInt(10);
		d2 = 2 + rando.nextInt(10);
		pTotal = p1 + p2;
		dTotal = d1 + d2;
		
		System.out.println("You get a " + p1 + "&" + p2 + "." );
		System.out.println("Your total is " + pTotal + ".");
		System.out.println("\n" + "The dealer has " + d2 + " showing and a hidden card.");
		System.out.println("The Dealer Total is hidden as well.");
		
		while(pTotal <22 && plaChoice.equals("hit") ){
			System.out.println("Would you like to \"hit\" or \"stay\"? ");
			plaChoice = in.nextLine();
			if(plaChoice.equals("hit")) {
				
				card = 2 + rando.nextInt(10);
				pTotal+=card;
				
				System.out.println("You drew a " + card + ".");
				if(pTotal > 21) {
					System.out.println("Bust!");
					
									
				}else {
					System.out.println("Your total is " + pTotal + ".");
				}
				
			}
			
			
			
			
			
		}
		System.out.println("Dealers Turn:" + "\n the hidden card was " + d1 + "\nDealer Total: " + dTotal );
		
		while(dTotal <= 17 && pTotal <= 21) {
			
			card = 2 + rando.nextInt(10);
			dTotal += card;
			
			System.out.println("Dealer chooses to hit.");
			System.out.println("Dealer draws: " + card + ".");
			
			if(dTotal <= 21 ) {
				System.out.println("Dealer Stays.");
							
			}
			if (dTotal > 21) {
				System.out.println("Deler Busts!");
			}else {
				System.out.println("Deler total is: " + dTotal + "." );
			}
			 if ( pTotal > 21 ) {
	                System.out.println( "DEALER WINS!" );
	            } else if ( dTotal > 21 ) {
	                System.out.println( "YOU WIN!" );
	            } else if ( pTotal > dTotal ) {
	                System.out.println( "YOU WIN!" );
	            } else if ( dTotal > pTotal ) {
	                System.out.println( "DEALER WINS!" );
	            } else {
	                System.out.println( "IT'S A TIE!" );
	            }
			
		}
		
	}
}
