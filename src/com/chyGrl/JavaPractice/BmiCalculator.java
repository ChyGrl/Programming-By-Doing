//BMI Calculator
//It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
//Sample Output

//For an extra +3 bonus points (+13 total), input their height in feet and inches.
//Your height (feet only): 5
//Your height (inches): 9
//Your weight in pounds: 160
//Your BMI is 23.625289

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args) {

		double bmi;
		double heightFt;
		double heightIn;
		double heightInTotal;
		double weightLbs;
		double weightKg;
		double heightMeters;
		double heightMeters2;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please Enter your height (feet only): ");
		heightFt = keyboard.nextDouble();

		System.out.println("Please Enter your height (inches only): ");
		heightIn = keyboard.nextDouble();

		System.out.println("Please Enter your weight in Pounds: ");
		weightLbs = keyboard.nextDouble();

		heightInTotal = ((heightFt * 12) + heightIn);
		heightMeters = heightInTotal * 0.025;
		weightKg = weightLbs * 0.45;
		heightMeters2 = heightMeters * heightMeters;

		bmi = (weightKg / heightMeters2);

		System.out.println("Your BMI: " + bmi);

	}
}
