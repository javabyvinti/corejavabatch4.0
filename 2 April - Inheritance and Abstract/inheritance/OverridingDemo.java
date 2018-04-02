package com.bmpl.inheritance;

class Bank1 {

	void rateOfInterest(){
		System.out.println("3% interest");
	}
	
	void withdraw(){
		
	}
	
	void deposit(){
		
	}
	
	void balanceCheck(){
		
	}
	
}

// access level --> same or increased but cannot be reduced

class HDFC1 extends Bank1{
	
	// Annotations --> developer plus compiler low level
	// @Override
	
				// overloading
	
	@Override
	public void rateOfInterest(){
		System.out.println("5% interest");
	}
	
	@Override
	void balanceCheck() {
		// TODO Auto-generated method stub
		super.balanceCheck();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	//@Override
	void services(){
		System.out.println("Additional Services");
	}
	
	
	
}



public class OverridingDemo {

	public static void main(String[] args) {
		
		HDFC1 hdfc = new HDFC1();
		hdfc.rateOfInterest();
		

	}

}
