package com.bmpl.inheritance;

class Bank{
	
	Bank(){
		System.out.println("Default cons of Bank class");
	}
	
	Bank(int data){
		System.out.println("Param cons of Bank class");
	}
	
}


class HDFC extends Bank{
	
	HDFC(){
		this(45);
		System.out.println("Default cons of HDFC class");
	}
	
	HDFC(int value){
		super(56);
		System.out.println("Param cons of HDFC class");
	}
	
}

class SBI extends HDFC{
//	SBI(){
//		//super();
//		System.out.println("Default of SBI");
//	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		//HDFC obj = new HDFC(45);
		SBI sbi = new SBI();
	}

}
