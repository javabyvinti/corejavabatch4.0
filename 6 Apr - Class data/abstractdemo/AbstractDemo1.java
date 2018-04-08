package com.bmpl.abstractdemo;

abstract class Calculate
{
	abstract int add(int first, int second);
}

public class AbstractDemo1 {

	public static void main(String[] args) {

		
		int result = new Calculate(){

			@Override
			int add(int first, int second) {
				return first + second;
			}
			
		}.add(12, 23); 
		
		System.out.println(result);	
	}
}