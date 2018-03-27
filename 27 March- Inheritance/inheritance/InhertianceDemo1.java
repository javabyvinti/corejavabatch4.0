package com.bmpl.inheritance;

class Person{
	
	int id;
	String name;
	String address;
	long phn;
	
	void personInput(int id, String name, String address, long phn){
		this.id = id;
		this.name = name;
		this.address = address;
		this.phn = phn;
	}

	void personOutput(){
		System.out.println("Name is = " +name);
		System.out.println("Id is = " + id);
		System.out.println("Address is = "+address);
		System.out.println("Phone no. is = "+phn);
	}
	
	void data(){
		System.out.println("Inside Person");
	}
}


class Student extends Person{
	int rollno;
	String course;
	
	void data(){
		System.out.println("Inside Student");
	}
	
	void studentInput(int rollno, String course){
		this.rollno = rollno;
		this.course = course;
	}
	
	void studentOutput(){
		System.out.println("Rollno is = "+rollno);
		System.out.println("Enrolled Course is = "+course);
	}
}

class Employee extends Student{
	
	void empDetails(){
		personInput(10001111, "Ram", "Delhi", 9854326549l);
	}
	
}

public class InhertianceDemo1 {

	public static void main(String[] args) {
			
		Student ram = new Student();

		ram.personInput(10001111, "Ram", "Delhi", 9854326549l);
		ram.studentInput(1, "BCA");
		ram.personOutput();
		ram.studentOutput();
		ram.data();
		
		//Employee emp = new Employee();
		
	}

}
