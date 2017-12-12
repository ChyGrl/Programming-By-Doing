package com.chyGrl.JavaPractice;

import java.util.Random;

public class FortuneCookie {
	public static void main(String[] args) {
		Random r = new Random();
		
		int lotto1 = 1 + r.nextInt(54);
		int lotto2 = 2 + r.nextInt(54);
		int lotto3 = 3 + r.nextInt(54);
		int lotto4 = 4 + r.nextInt(54);
		int lotto5 = 5 + r.nextInt(54);
		int lotto6 = 6 + r.nextInt(54);

	int fortune = 1 + r.nextInt(6);
	String fortuneMsg;
	
	if(fortune == 1) {
		fortuneMsg = "Happiness is in your grasp";
		
	}
	else if (fortune == 2) {
		fortuneMsg = "Its cheaper to keep her";
		
	}
	else if(fortune == 3) {
		fortuneMsg = "Never doubt your first mind";
		
	}
	else if(fortune == 4) {
		fortuneMsg = "Toes, while cheesy, still are essential for balance";
	}
	else if(fortune == 5) {
		fortuneMsg = "Kindness is not a weapon, dont kill with it";
	}
	else if(fortune == 6) {
		fortuneMsg = "Mystery is A fragile Beauty, dont handle her";
		
	}
	else {
		fortuneMsg = "Your future is uncertain";
	}
	
	System.out.println("Your fotune cookie says: " + "\n\t" + fortuneMsg);
	System.out.println( "\t" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 );

	}

}
