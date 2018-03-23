package com.bmpl.constructor;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		
		Encapsulation user1 = new Encapsulation();
		//user1.rollno = -65;
		//user1.inputDetails();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your rollno");
		
		user1.setRollno(scanner.nextInt());
		System.out.print("Your rollno is = ");
		System.out.println(user1.getRollno());
	
		System.out.println("Enter your Phone Number");
		
		user1.setPhn(scanner.nextLong()); // \n
		System.out.print("Your Phone Number is = ");
		System.out.println(user1.getPhn());

		System.out.println("Enter your Name");
		
		scanner.nextLine(); // handle \n
		user1.setName(scanner.nextLine()); // \n --> i will quit
		System.out.print("Your Name is = ");
		System.out.println(user1.getName());

	}

}
