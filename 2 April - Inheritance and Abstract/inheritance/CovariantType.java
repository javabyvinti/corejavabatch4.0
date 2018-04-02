package com.bmpl.inheritance;

// java 1.5 --> covariant
class E{
	
	int x;
	int y;
	String name;
	float f;
	
}

class E1 extends E{
	
	int z;
	
}


class Data{
	
	int value;
	String data;
	float f;
	
	// covariant
	
	E show(){
		
		E obj = new E();
		obj.x = 100;
		obj.y = 200;
		obj.name = "Ram";
		obj.f = 65.54f;
		
		return obj;
	}
}

class Data1 extends Data{
	
	// covariant --> 1.5 
	
	@Override
	E1 show(){
		
		E1 obj = new E1();
		
		obj.z = 43;
		
		return obj;
		
	}
	int display(){
		return 43;
	}
		
}


public class CovariantType {

	public static void main(String[] args) {
		Data obj = new Data();
		E e = obj.show();
		System.out.println(e.x);
		System.out.println(e.y);
		System.out.println(e.name);
		System.out.println(e.f);
		
		Data1 data1 = new Data1();
		int i = data1.display();
	}

}
