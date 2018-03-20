package com.bmpl.javabasic;

public class EnhanceForLoop {

	public static void main(String[] args) {
		
		int values[] = {43, 76, 54, 32, 65, 21, 76, 312, 87, 443};
		
		System.out.println(values.length);
		
//		for(int i = 0; i<values.length; i++){
//			System.out.println(values[i]);
//		}
		// Traversing of array elements
		//Enhanced for loop
		for(int i : values){
			System.out.println(i);
		}
		
		
	}

}
