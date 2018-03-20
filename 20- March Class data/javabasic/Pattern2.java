package com.bmpl.javabasic;


/*
	A			// column
	AB
	ABC
	ABCD
	ABCDE
 */


public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i = 'A'; i<='E'; i++)
		{ 
			for(int j = 'A'; j<=i; j++)
			{ 
				System.out.print((char)j); // *****
			}
			System.out.println();
		}

		//System.out.println(1 + 'A');
		
	}

}
