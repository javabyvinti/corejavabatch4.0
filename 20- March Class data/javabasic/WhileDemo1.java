package com.bmpl.javabasic;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		
		// 1 to 10
		
		int value = 1;
		// table user
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		
		while(value<=10){ //11<=10
			System.out.println(userChoice+"X"+value+"=" +value * userChoice);   //10
			value++; // 1++ --> 10 + 1 = 11
		}
		// 2 X 1 = 2
		

	}

}
