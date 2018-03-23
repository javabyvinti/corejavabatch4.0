package com.bmpl.constructor;

public class ConsDemo1 {

	public String name;
	int rollno;
	
	// default --> access modifier --> access inside the package
	public ConsDemo1(){
		name = "Ram kumar";
		rollno = 1;
	}
	
	ConsDemo1(String nm, int rl){
		name = nm;
		rollno = rl;
	}
	
	

	// method
//	void ConsDemo1(){
//		
//	}
	
	void input(){
		name = "Ram Kumar";
		rollno = 1;
	}
	
	
	void print(){
		System.out.println("Name is = " +name);
		System.out.println("Rollno is = "+rollno);
	}
	
	
	public static void main(String[] args) {
		//ConsDemo1 obj1 = new ConsDemo1();
		
		ConsDemo1 obj2 = new ConsDemo1("Mohan", 4);
		//obj.input();
		//System.out.println(obj2.name + obj2.rollno);

		//obj1.print();
		obj2.print();
	}
}
