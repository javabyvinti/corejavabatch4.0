package com.bmpl.javabasic;

/*

	************* --> 13 
	****** ****** --> 12
	*****   ***** --> 10
	****     **** --> 8
	***       ***
	**         **
	*           *

 */

public class Pattern6 {

	public static void main(String[] args) {
		
		System.out.println("*************");
		
		for(int row = 1; row<=6; row++)// row = 1<=6
		{
			for(int column = 6; column>=row; column--){
				System.out.print("*");
			}
			//1<=(3)
			for(int space = 1; space<=(2*row-1); space++){
				System.out.print(" ");
			}// 6>=6
			for(int column = 6; column>=row; column--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
