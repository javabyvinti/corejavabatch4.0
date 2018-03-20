package com.bmpl.javabasic;

/*
 
 * 
 ***
 *****
 ***
 *
  
 */
public class Pattern4 {

	public static void main(String[] args) {
		
		for(int row = 1; row<=3; row++){
			for(int column = 1; column<=(2*row-1); column++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row = 2; row>=1; row--)
		{
			for(int column = (2*row-1); column>=1; column--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
