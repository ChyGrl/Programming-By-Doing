package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class RightTriangleChecker {
public static void main(String[] args) {
	
	int side1, side2, side3;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter three intergers, one for each side of a right triangle "
		+ "Side 1:  "	);
	side1 = keyboard.nextInt();
	
	while(side1 <= 0) {
		System.out.println("A side cannot be negaive " + "\nSide 1 :");
		side1 = keyboard.nextInt();
	}
	System.out.println("Side 2: ");
	side2 = keyboard.nextInt();
	
	while (side2 < side1) {
		System.out.println("Side two is smaller than side 1. " + "\n Enter Side 2: ");
		side2 = keyboard.nextInt();

	}
	System.out.println("Side 3: ");
	side3 = keyboard.nextInt();
	while(side3 < side3) {
		System.out.println("side three is smaller than side 2 " + "\n Enter Side 3: ");
		side3 = keyboard.nextInt();

	}
	System.out.println("Your three sizes are: " + side1 + " "+ side2 + " " + side3);
	double rightTri = Math.sqrt(side1*side1 + side2*side2);
	
	if (rightTri == side3) {
		System.out.println("Yep thats a right Traingle.");
		
	}
	else {
		System.out.println("NOPE... not a right triangle.");
	}
	
}

}
