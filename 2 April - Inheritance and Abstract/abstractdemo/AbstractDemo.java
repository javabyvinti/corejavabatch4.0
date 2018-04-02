package com.bmpl.abstractdemo;

abstract class Bank{
	
	void deposit(){
		System.out.println("Add amount to Database");
	}
	
	void withdraw(){
		System.out.println("Withdraw amount from database");
	}
	
	abstract void services();
	
	abstract void rateOfInterest();	//declaration
	
}

class HDFC extends Bank{

	@Override
	void rateOfInterest() {
		System.out.println("6%");
		
	}

	@Override
	void services() {
		// TODO Auto-generated method stub
		
	}
	
//	void rateOfInterest(){
//		System.out.println("6%");
//	}
}

abstract class ICICI extends Bank{

}

//class PitampuraBranch extends ICICI{
//
//	@Override
//	void rateOfInterest() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	void services() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

public class AbstractDemo {

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.rateOfInterest();
		
		// cannot create object
		//ICICI icici = new ICICI();
		//Bank bank = new Bank();

	}

}
