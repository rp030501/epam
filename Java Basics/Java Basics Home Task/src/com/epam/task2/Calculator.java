package com.epam.task2;

public class Calculator {

	public static void main(String[] args) {
		float value1=Integer.parseInt(args[1]);
		float value2=Integer.parseInt(args[2]);
		switch(args[0]){
			case "Addition":
				System.out.println("Addition of Two Numbers "+(value1+value2));
				break;
			case "Substraction":
				System.out.println("Substraction of Two Numbers "+ (value1-value2));
				break;
			case "Multiplication":
				System.out.println("Multiplication of Two Numbers "+ (value1*value2));
				break;
			case "Division":
				System.out.println("Division of Two Numbers "+(value1/value2));
				break;
			case "Reminder":
				System.out.println("Reminder of Two Numbers "+ (value1%value2));
				break;
			case "Percent":
				if(value1>value2) {
					float result=value2/value1;
					System.out.println("Percentage: "+ (result)*100);
					
				}
				else {
					float result=value1/value2;
					System.out.println("Percentage: "+ (result)*100);
				}
				break;
			default:
				System.out.println("Please Choose Right Operation:)");
				break;
		}
	}

}
