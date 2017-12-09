package com.chyGrl.JavaPractice;

public class YourSchedule {

//	Use several variables to store the names of your classes and their teachers. Then, display a nice little table displaying your schedule.	Just FYI, my column of courses has a width of 26 characters, and the teacher column has a width of 15. The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.
//
//	Your table doesn't need to look exactly like this, or even line up. I used a total of sixteen variables (course1, course2, ... course8, teacher1, teacher2, etc.). You should do the same.
//
//	 
//	+------------------------------------------------------------+
//	| 1 |                          English III |       Ms. Lapan |
//	| 2 |                          Precalculus |     Mrs. Gideon |
//	| 3 |                         Music Theory |       Mr. Davis |
//	| 4 |                        Biotechnology |      Ms. Palmer |
//	| 5 |           Principles of Technology I |      Ms. Garcia |
//	| 6 |                             Latin II |    Mrs. Barnett |
//	| 7 |                        AP US History | Ms. Johannessen |
//	| 8 | Business Computer Infomation Systems |       Mr. James |
//	+------------------------------------------------------------+
//
//
	

	//variables
	
	public static void main(String[] args) {
		
	
	String sub1 = "English III";
	String sub2 = "Precalculus";
	String sub3 = "Music Theory";
	String sub4 = "Principle of Technology I";
	String sub5 = "Latin II";
	String sub6 = "AP US History";
	String sub7 = "Business Computer Info Systems";
	String sub1T = "Ms. Lapan";
	String sub2T = "Mrs. Gideon";
	String sub3T = "Mr. Davis";
	String sub4T = "Ms. Palmer";
	String sub5T = "Ms. Garcia";
	String sub6T = "Mrs. Barnett";
	String sub7T = "Ms. Johannessen";
	String sub8T = "Mr. James";
			
System.out.println("+------------------------------------------------------------+");
System.out.println("| 1 |                          "+sub1+" |       "+sub1T+" |");
System.out.println("| 2 |                          "+sub2+" |     "+sub2T+" |");
System.out.println("| 3 |                         "+sub3+" |       "+sub3T+" |");
System.out.println("| 4 |            "+sub4+" |      "+sub4T+" |");
System.out.println("| 5 |                             "+sub5+" |      "+sub5T+" |");
System.out.println("| 6 |                        "+sub6+" |    "+sub6T+" |");
System.out.println("| 7 |       "+sub7+" | "+sub7T+" |");
System.out.println("| 8 |       "+sub7+" |       "+sub8T+" |");
System.out.println("+------------------------------------------------------------+");
	
}
	
	

}