package com.bmpl.javabasic;
/*

	*
	***
	*****
	***
	*

 */

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int row = 1; row<=3; row++){ // row = 4<=3
			
			for(int column = 1; column<=(2*row-1); column++){
				System.out.print("*");// col =1<=(3) //*  
			}										// ***
			System.out.println();
		}

		for(int row = 2; row>=1; row--)// row  = 1>=1
		{			// 1>=1
			for(int column = (2*row-1); column>=1; column--){
					System.out.print("*"); // ***
			}
			System.out.println();
		}
		
	}

}
