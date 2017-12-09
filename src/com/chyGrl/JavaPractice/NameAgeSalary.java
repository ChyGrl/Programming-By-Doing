package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class NameAgeSalary {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	String name;
	int age;
	double salary;
	
	System.out.print("What is your Name? ");
	name = keyboard.next(); 
	System.out.println("Your name is: " + name);
	
	System.out.print("How old are you? ");
	age = keyboard.nextInt();
	System.out.println("Your age is: " + age);
	
	System.out.print("How much do you make per year? " );
	salary = keyboard.nextDouble();
	System.out.println("Your Salary is: " + salary);
	
	
	}
}
