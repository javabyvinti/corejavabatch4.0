package com.bmpl.constructor;

import java.util.Scanner;

public class Encapsulation {
	// private --> access modifier--> only inside the class
	
	private int rollno;
	private String name;
	private long phn;

	
	
	
	
	// setter for rollno
//	public void setRollno(int rollno){
//		// when name of local variable and instance variable is same
//		// then use this keyword to point to instance variable
//		this.rollno = rollno;// this keyword use -> class instance variable
//	}
//	
//	public int getRollno(){
//		return rollno;
//	}
//	
//	
//	void setName(String name){
//		this.name = name;
//	}
	
	
	
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		if(rollno>0){
			this.rollno = rollno;	
		}else 
			System.out.println("Only Positive numbers are allowed");;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name.trim();// eliminate all the whitespaces
		this.name = name;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(Long phn) {
		if(phn>0 && (phn.toString().length() == 10))
			this.phn = phn;
		else
			System.out.println("Only positive numbers are allowed and length must be 10");
	}

	public void inputDetails(){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your rollno");
//		rollno = scanner.nextInt();
//		System.out.println("Entered rollno is = " +rollno);
	}
	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.inputDetails();
		
	}

}
