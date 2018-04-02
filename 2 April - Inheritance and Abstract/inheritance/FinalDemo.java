package com.bmpl.inheritance;

// final --> variable, method, class

final class Account{
	
	String nameOfBank;
	
	//Account name = "";
	
	final int MINIMUM_BALANCE = 1000;
	int accountnumber;
	
	void balanceCheck(){
		//MINIMUM_BALANCE = 2998;
		accountnumber = 12434343;
	}
	
	
	final void deposit(){
		System.out.println("Amount added into database");
	}
}

final class SavingAccount /*extends Account*/{
	
	void deposit(int amount){
		
	}
	
}


public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
