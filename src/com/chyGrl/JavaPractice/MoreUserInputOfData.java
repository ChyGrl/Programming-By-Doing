//More User Input of Data
//
//Ask the user for several pieces of information, and display them on the screen afterward as a summary.
//
//first name
//last name
//grade (classification)
//student id number
//login name
//GPA (0.0 to 4.0)

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class MoreUserInputOfData {

public static void main(String[] args) {
	

		String firstName;
		String lastName;
		int gradeLevel;
		int studentId;
		String loginName;
		double gPa;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your First Name? ");
		firstName = keyboard.nextLine();
		System.out.print("What is your Last Name? ");
		lastName = keyboard.nextLine();
		System.out.print("What is your Grade Level? ");
		gradeLevel = keyboard.nextInt();
		System.out.print("What is your Student ID Number? ");
		studentId = keyboard.nextInt();
		
		System.out.print("What is your Login Name? ");
		loginName= keyboard.nextLine();

		System.out.print("What is your Grade point average? ");
		gPa = keyboard.nextDouble();
	
System.out.println("Student Info:" + "\nName: " + " " + firstName+ " "+ lastName+
				"\nGrade Level: "  + gradeLevel+ 
				"\nStudentId: " + studentId+
				"\nLogin Name: " + loginName + 
				"\nGrade Point Average: " + gPa);
	

		
	}			

	}