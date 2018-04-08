package com.bmpl.abstractdemo;

abstract class Bank{
	
	Bank(){
		System.out.println("default cons of Bank");
	}
	
	void deposit(){
		System.out.println("Add amount to Database");
	}
	
	void withdraw(){
		System.out.println("Withdraw amount from database");
	}
	
	void services(){
		System.out.println("Services of Bank");
	}
	
	abstract void rateOfInterest();	//declaration
	
}

class HDFC extends Bank{

	
	@Override
	void services() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void rateOfInterest() {
		System.out.println("Rate of Interest of HDFC");
		
	}
	
//	void rateOfInterest(){
//		System.out.println("6%");
//	}
}

class ICICI extends Bank{

	@Override
	void rateOfInterest() {
		// TODO Auto-generated method stub
		
	}

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

		HDFC hdfc = new HDFC();
		hdfc.rateOfInterest();
		
	// scope
		Bank b = new HDFC();//upcasting
		b.rateOfInterest();
	}

}
