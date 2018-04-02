package com.bmpl.inheritance;

class Demo{
	int value = 5;
	
}

class Demo1 extends Demo{
	
	int value = 10;
	
	void print(){
		System.out.println("Print of Demo1");
	}
	
}

class Demo2 extends Demo1{
	
	int value  = 15;
	
	void print(){
		//super.value = 90;
		super.print();
		System.out.println("Print of Demo2");
	}
}

class Demo3 extends Demo2{
	int value  =20;
	
	void show(int value){ //5 + 20 + 15 + 10 = 50 
		value = value + this.value + super.value + ((Demo1)this).value;
		System.out.println("value is = " +value);
				
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		
		Demo2 demo2 = new Demo2();
		demo2.print();
		Demo3 demo3 = new Demo3();
		demo3.show(5);

	}

}
