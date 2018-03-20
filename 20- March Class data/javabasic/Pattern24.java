package com.bmpl.javabasic;

/*
      *	row = 1, 5
     ** column = 1,5
    *** 
   ****
  *****
  
 */

public class Pattern24 {

	public static void main(String[] args) {
	
		for(int row = 1; row<=5; row++)
		{
			for(int space = 4; space>=row; space--){
				System.out.print(" ");
			}
			
			for(int column = 1; column<=row; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
