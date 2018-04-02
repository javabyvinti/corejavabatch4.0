package com.bmpl.inheritance;

public class InheritanceDemo4 {

	int first = 12;
	int second = 12;
	//int second;
	
	InheritanceDemo4(){
		
	}
	
	
	// constructor overload
	InheritanceDemo4(int v){
		
	}
	
	// method overload
	void sum(){
		System.out.println(first+second);
	}
	
	long sum(int v){
		
		return 0;
	}
	
	
	// overloaded method
	void sum(int first, int second){
		System.out.println(first + second);
	}
	
	long sum(long first, long second, long third){
		return first + second + third;
	}
	
	
	public static void main(String[] args) {

		InheritanceDemo4 obj = new InheritanceDemo4();
		obj.sum();
		obj.sum(34, 56);
		System.out.println(obj.sum(12, 6754545454l, 90));
		
		
//		System.out.println(10 + 10);
//		System.out.println("hey" + "java");
//		System.out.println(12 + "java");
//		System.out.println("java" + 89);
//		

	}

}
