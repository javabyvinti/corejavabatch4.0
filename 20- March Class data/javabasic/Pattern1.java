package com.bmpl.javabasic;

/*
	*****  i = 5,1 j=5,1
	****
	***
	**
	*

 */


public class Pattern1 {

	public static void main(String[] args) {
		
//		for(int i = 1; i<=5; i++){ // i=2<=5
//			for(int j = 1; j<=i; j++){ // j=1<=5
//				System.out.print("*"); // *****
//			}
//			System.out.println();
//		}
		
		
		for(int i = 5; i>=1; i--){ // i=3>=1
			for(int j = 1; j<=i; j++){ // j=1<=3
				System.out.print("*"); // *****
			}						//    ****
			System.out.println();
		}

	}

}
