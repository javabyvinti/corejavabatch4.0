package com.bmpl.classobject;

public class Employee {

	String name;
	int id;
	
	void print(){
		System.out.println("Name  = " +name);
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println("Employee Name is = " +emp.name);
		System.out.println("Employee Id is = "+emp.id);

	}

}
