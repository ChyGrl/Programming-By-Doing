package com.chyGrl.JavaPractice;

public class CompareTo {
public static void main(String[] args) {
	
	System.out.print("Comparing \"axe\" with \"dog\" produces ");
	int i = "axe".compareTo("dog");
	System.out.println(i);

	System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
	System.out.println( "applebee's".compareTo("apple") );
	

	System.out.print("Comparing \"chili's\" with \"chili\" produces ");
	System.out.println( "chili's".compareTo("chili") );
	
	System.out.print("Comparing \"are\" with \"jam\" produces ");
	System.out.println( "are".compareTo("jam") );
	
}}
