package com.bmpl.inheritance;

class A1{
	
	A1(){
		System.out.println("cons of A1");
	}
	
	void show(){
		System.out.println("Show of A1");
	}
	
	void display(){
		System.out.println("Display of A");
	}
	
}

class B1 extends A1{
	
	B1(){
		System.out.println("Cons of B1");
	}
	
	void show(){
		System.out.println("Show of B1");
	}
	
	void details(){
		System.out.println("Details of B1");
	}
	
}


public class UpcastingDowncasting {

	public static void main(String[] args) {

		// upcasting --> scope --> change --> to the parent level
	
		// check the methods which are overrided by the child class
		
		A1 b1 =  new B1();	// object of B1 class is created here
		b1.show();
		b1.display();
		//b1.details();
		
		B1 obj = (B1)b1;	// downcasting
		
		obj.details();
		
		System.out.println(b1.toString());
		System.out.println(obj);
		
		float f = 45;
		int i = (int)f;	// explicit typecasting
		
		
		//B1 obj = new B1();	// obj --> child

		//Math.pow(a, b);
		
	}

}
