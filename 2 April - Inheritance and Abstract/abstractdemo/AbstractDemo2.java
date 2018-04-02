package com.bmpl.abstractdemo;

abstract class Account{
	
	int value;
	
	Account(int val){
		value = val;
		System.out.println("Default cons of Account");
	}
	
	void calculate(){
		System.out.println(value + 60);
	}
	
	abstract void display();
}


final class SavingAccount extends Account{
	
	
	SavingAccount(int val){
		super(val);
		System.out.println("Default cons of SavingAccount");
	}

	@Override
	void display() {
		System.out.println("display of saving account");
		
	}
	
}

public class AbstractDemo2 {
	
	public static void main(String[] args) {
		Account obj = new SavingAccount(56);
		obj.display();
	}
}
