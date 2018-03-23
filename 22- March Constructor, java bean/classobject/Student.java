package com.bmpl.classobject;

public class Student {

	//states
	// by default have default values
	
	// instance variables or global variables --> which are available througout the class 
	// and declared outside any method or constructor or block but inside the class
	// instance variable have there local values
	
	String name;	
	int rollno;
	long phn;
	float percentage;
	boolean present;
	char grade;
	byte age;
	short marks;
	double data;
	
	
	public static void main(String[] args) {
		int val;
		// variable inside a method or constructor or block --> local variable
		//System.out.println(val);
	}
	
	
	//behaviour
	void input(){
		name = "Ram Kumar";
		rollno = 1;
		phn = 9843325424l;
		int val;
		//System.out.println(val);
	}
	
	void display(){
		System.out.println("Double is = " + data);
		System.out.println("Name is = " + name);
		System.out.println("Rollno is = "+rollno);
		System.out.println("Phone Number is = " +phn);
		System.out.println("Grade is = "+grade);
		System.out.println("Marks is = "+marks);
		System.out.println("Percentage is = " +percentage);
		System.out.println("Age is = "+age);
		System.out.println("Present  = " + present); 
		
		
	}


}
