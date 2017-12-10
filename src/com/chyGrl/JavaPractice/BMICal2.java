package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class BMICal2 {

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
//		//
//		BMI	category
//		less than 18.5	underweight
//		18.5 to 24.9	normal weight
//		25.0 to 29.9	overweight
//		30.0 or more	obese

		if (bmi< 18.5) {
			System.out.println("Your ass is Skinny");
			
		}
		else if(bmi<24.9) {
			System.out.println("You are normal... Well according to society.");
			
		}
		else if(bmi <29.9) {
			System.out.println("You a little plump... but Im not judging");
		}
		else if (bmi <40){
			System.out.println("I think you look good... but you may wanna work on your health.");
		}
		else {
			System.out.println("Things is getting out of hand, just saying.");
		}
		
	}
	
}
