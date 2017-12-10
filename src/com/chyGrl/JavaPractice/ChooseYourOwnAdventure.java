package com.chyGrl.JavaPractice;
//Choose Your Own Adventure!

//
//Make a short "Choose Your Own Adventure" game. The starting room should give the user two choices. Then the second room they travel to should give them two more choices. Finally the third room should give them two choices.
//
//This means your game will have eight possible "endings". Your game will also have a total of fifteen rooms:
//
//        _ R1 _
//       /      \
//    R2          R3
//   /  \        /  \
// R4    R5    R6    R7
// /\    /\    /\    /\
//E1 E2 E3 E4 E5 E6 E7 E8

import java.util.Scanner;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {

		String r2 = "kitchen";
		String r4 = "refrigerator";
		String r5 = "cabinet";
		String r6 = "window";
		String r7 = "door";

		String e1 = "yes";
		String e2 = "no";
		String e3 = "close the door";
		String e4 = "poke it";
		String e5 = "";
		String e6 = "";
		String e7 = "";
		String e8 = "";

		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner ni = new Scanner(System.in);
		Scanner ni1 = new Scanner(System.in);
		Scanner ni2 = new Scanner(System.in);

		System.out.println("WELCOME TO CHYs TINY ADVENTURE!");

		System.out.println("You are trapped in a creepy house! \nBe careful of your choices, there is no turning back"
				+ "\nWould you like to go 'upstairs' or into the 'kitchen'? ");
		if (in.hasNext(r2)) {

			// kitchen
			System.out.println("Its a typical kitchen, with no way out. There is a refrigerator and a cabinet. "
					+ "\n Would you like to open the refrigerator or the cabinet? ");
			if (in2.hasNext(r4)) {
				System.out.println(" There is rancid food and a dying rodent inside. Do you eat the food? yes or no ");
				if(in2.hasNext())
				if (in3.hasNext(e1)) {
					System.out.println("You die of poisening.");
				} else {
					System.out.println("You eventually die of starvation");
				}
			}
		} else {
			// upstairs
			System.out.println("There is a long hallway, with an open window straight and an open door to the left"
					+ "\n Do you try escape through the window Or go through the door? ");
			if (ni1.hasNext(r6)) {
				System.out.println("You slip on the roof tiles and fall to your death.");
			}
			if (ni1.hasNext(r7)) {
				System.out.println("There is a giant rabies ridden Bat hanging from the cieling, "
						+ "Do you CLOSE THE DOOR or POKE IT with a stick?");
				if (ni2.hasNext(e3)) {
					System.out.println("A tiger randomly is roaming the hall and rips you apart.");

				}
				else {
					System.out.println("The bat awakens, adopts you as his own. You cantract rabies and die an long angry death. ");
				}
			}
		}

	}
}
