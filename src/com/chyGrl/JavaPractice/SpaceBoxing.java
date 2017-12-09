//Space Boxing
//
//Julio Cesar Chavez Mark VII is an interplanetary space boxer, 
//who currently holds the championship belts for various weight categories on many different planets within our solar system. 
//However, it is often difficult for him to recall what his "target weight" needs to be on earth in order to make the weight 
//class on other planets.	
//Write a program to help him keep track of this.
//It should ask him what his earth weight is, 
//and to enter a number for the planet he wants to fight on. 
//It should then compute his weight on the destination planet based on the table below:
//#	Planet	Relative gravity
//1	Venus	0.78
//2	Mars	0.39
//3	Jupiter	2.65
//4	Saturn	1.17
//5	Uranus	1.05
//6	Neptune	1.23
//So, for example, if Julio weighs 128 lbs. on earth,
//then he would weigh just under 50 lbs. on Mars, 
//since Mars' gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)

package com.chyGrl.JavaPractice;

import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		double earthWeight;
		int planet;
		double venusGrav = 0.78;
		double marsGrav = 0.39;
		double jupGrav = 2.65;
		double satGrav = 1.17;
		double uranGrav = 1.05;
		double nepGrav = 1.23;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Interplanetary Weight Calculator");
		System.out.println("Enter Earth Weight: ");
		earthWeight = keyboard.nextDouble();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter boxing planet number:" + "\n1) Venus" +"\n2) Mars 3) Jupiter 4) Saturn 5) Neptune ");
		planet = in.nextInt();
		{
		
		if (planet == 1) {
			System.out.println("Venus Boxing Weight: " +(earthWeight * venusGrav));
			
		}
		if (planet == 2) {
			System.out.println("Mars Boxing Weight: " +(earthWeight * marsGrav));
			
		}
		if (planet == 3) {
			System.out.println("Jupiter Boxing Weight: " +(earthWeight * jupGrav));
			
		}
		if (planet == 4) {
			System.out.println("Saturn Boxing Weight: " +(earthWeight * uranGrav));
			
		}if (planet == 5) {
			System.out.println("Neptune Boxing Weight: " +(earthWeight * nepGrav));
			
		
		}if(planet>5) {
			System.out.println("This is not a competing planet.");
		}
		
		}
	}
}
