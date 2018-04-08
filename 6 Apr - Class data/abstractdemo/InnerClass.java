package com.bmpl.abstractdemo;

import com.bmpl.abstractdemo.Outer.Inner;

class Outer{

	int value;
	
	void display(){
		System.out.println("Inside the Outer class");
	}
	
	// inner class
	class Inner{
	
		int data;
	 
	 
		void show()
		{
			System.out.println("Inside the Inner class");
		}
	
	}
	
}


public class InnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
	}

}
