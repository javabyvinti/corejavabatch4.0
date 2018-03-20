package com.bmpl.javabasic;

/*
   	   *		row = 1, 5 column = 1, 9
      ***
     *****
    *******
   *********
    
 */


public class Pattern3 {

	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++)//3<=5
		{
			for(int space = 5; space>=row; space--){// 5>=3
				System.out.print(" ");
			}
										// 1<=5
			for(int column = 1;column<=(2*row-1); column++)
			{
				System.out.print("*"); 
				
			}
			System.out.println();
		}

	}

}
