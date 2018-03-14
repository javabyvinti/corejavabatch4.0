package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo1 {

	// if-else --> condition --> heavy
	// switch --> && or || or > or < --> Relational  true or false
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your character");
		
		char userChoice = scanner.next().charAt(0);
		// p
		
		switch(userChoice){
			
		case 'a':	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Vowel");
			break;
		case 'e':	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Vowel");
			//break;
			
		case 'i':	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Vowel");
			break;
			
		case 'o':	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Vowel");
			break;
			
		case 'u':	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Vowel");
			break;
			
		default:	// userChoice == 'a' // 'a' == 'a'
			System.out.println("Consonant");
			break;
			
		}
		
	}

}
