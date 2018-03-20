package com.bmpl.javabasic;

import java.util.Scanner;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int firstValue = scanner.nextInt();
		

		System.out.println("Enter your second number");
		int secondValue = scanner.nextInt();

		System.out.println("Enter your third number");
		int thirdValue = scanner.nextInt();

		
		if(firstValue>secondValue && firstValue > thirdValue){
			System.out.println("First value is greater");
		}
		else if(secondValue> thirdValue){
			System.out.println("Second value is greater");
		}
		else{
			System.out.println("Third value is greater");
		}
		
	}

}
