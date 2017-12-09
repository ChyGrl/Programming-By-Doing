//Weekday Name
//
//I have provided a function that is supposed to return the name of a day of the week given the day number.
//Use if and else to complete it according to the following table:
//
//Number	Day of week
//1	Sunday
//2	Monday
//3	Tuesday
//4	Wednesday
//5	Thursday
//6	Friday
//7	Saturday
//0	Saturday
//anything else	"error"

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class WeekdayName {

	public static void main(String[] args) {

		int num;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Number for the Day of the week. ");
		
		num = keyboard.nextInt();
		
		if(num ==1) {
			System.out.println("Sunday");
		}
		if(num ==2) {
			System.out.println("Monday");
		}
		if(num ==3) {
			System.out.println("Tuesday");
		}if(num ==4) {
			System.out.println("Wednesday");
		}if(num ==5) {
			System.out.println("Thursday");
		}if(num ==6) {
			System.out.println("Friday");
		}if(num ==7) {
			System.out.println("Saturday");
		}if(num > 7 ){
			System.out.println("ERROR");
		}
	}

}
