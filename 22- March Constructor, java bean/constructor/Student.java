package com.bmpl.constructor;

public class Student {

	String name;
	String collegeName;
	int rollno;
	float percentage;
	//double value = 89.54;
	
	// initialize instance variable with own default values --> constructor
	
	// default cons --> same for all objects
	// param cons --> different for all objects
	
	// default cons
	// param cons
	
	Student(){
		this.collegeName = "PCTI";
		//percentage = (float)value;
	}
	
	Student(String nm, int rl){
		
		//this();// constructor calling
				// constructor chaining
		this(76.54f);	//must be first statement
		this.name = nm;
		this.rollno = rl;
	}
	
	void Student(){
		
	}
	Student(float percent){
		//this();
		Student();
		percentage = percent;
	}
	
	void show(){
		System.out.println("Show message");
	}
	
	
	void print(){
		show();
		System.out.println("College Name = "+collegeName);
		System.out.println("Name  = " +name);
		System.out.println("Rollno = "+rollno);
		System.out.println("Percentage = " +percentage);
	}
	
	public static void main(String[] args) {
		
		Student ram = new Student("Ram",1);
		ram.print();
		

	}

}
