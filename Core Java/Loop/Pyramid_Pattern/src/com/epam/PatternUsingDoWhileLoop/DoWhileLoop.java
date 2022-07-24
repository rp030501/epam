package com.epam.PatternUsingDoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {
	public static void pattern(int Number, int X) {
		//Pattern using While Loop 
		int row=0;
		
		int element=0;
		do {
			int col=0;
			 do{
				System.out.print(element);
				element+=X;
				col=col+1;
				System.out.print(" "+"\t");
			}while(col<=row);
			row=row+1;
			System.out.println();
		}while(row<Number);
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
