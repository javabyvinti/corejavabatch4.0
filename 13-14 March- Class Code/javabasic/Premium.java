package com.bmpl.javabasic;

import java.util.Scanner;

public class Premium {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person Name");
		String name = scanner.next();
		
		System.out.println("Enter Gender");
		//String gender = scanner.next().toLowerCase();
		
		char gender = scanner.next().charAt(0);
		
		System.out.println("Gender is = "+gender);
		
//		System.out.println("Enter Age");
//		int age = scanner.nextInt();
//		
//		System.out.println("Enter city[Metro/Non-Metro]");
//		String city = scanner.next().toLowerCase();
//		
//		if((age>25 && age<35) && (gender.equals("male") || gender.equals("m")) && city.equals("metro")){
//			System.out.println("Premium is 6%");
//		}	
		
		String input = "This is my data";
	     Scanner s = new Scanner(input);
	     System.out.println(s.next());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();

	}
}