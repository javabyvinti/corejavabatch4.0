package com.bmpl.javabasic;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		// 80-100 --> grade --> A
		// 60-80  --> grade --> B
		// 40-60  --> grade --> C
		//    <40 --> grade --> D 

		// if-else --> 300
		//percentage out of 100 --> 0 to 100
		//validation --> if-else
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks");
		
		int marks = scanner.nextInt();
		
		int engMarks = scanner.nextInt();
		
		int mathsMarks = scanner.nextInt();
		
		float percentage = 0;
		
		if((engMarks>=0 && engMarks<=100) && (mathsMarks>=0 && mathsMarks<=100))
			percentage = engMarks + mathsMarks/2;
		else
			System.out.println("Marks must be between 1-100");
		
		if(marks>80 && marks<=100){
			System.out.println("Grade A");
		}else if(marks>60 && marks<=80){
			System.out.println("Grade B");
		}
		else if(marks>40 && marks<=60){
			System.out.println("Grade C");
		}else if(marks<40){
			System.out.println("Grade D");
		}else{
			System.out.println("Enter marks between 1-100");
		}
		
		System.out.println("Your Percentage is = " + percentage);
		
		
	}

}
