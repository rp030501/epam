package com.epam.PatternUsingForLoop;

import java.util.Scanner;

public class ForLoop {
	
	//Method to Print Pyramid Pattern
	public static void pattern(int Number, int X) {
		//Pattern using For Loop 
		int element=0;
		for(int row=0;row<Number;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print(element);
				element=element+X;
				System.out.print(" " + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//Scanner Class Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("Pyramid");
		System.out.println();
		
		//User Input
		System.out.println("Enter Number:");
		int Number = sc.nextInt();
		System.out.println("Enter X:");
		int X = sc.nextInt();
		
		//pattern method call with parameters Number and X
		pattern(Number, X);
		
	}

}
