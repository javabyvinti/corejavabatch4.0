// swap two values program
// 1. swap with third variable
//2. swap without third variable


import java.lang.*; // written by java for every class

class SwapData{

	// java 1.5 version
	static public void main(String[] args) // "12"
	{

		// command line arguments --> 
		// Predefined classes 
			// Float

		// int parseInt(String value){}
		
	//int value1 = Integer.parseInt(args[0]);// "12"

	//int value2 = Integer.parseInt(args[1]);
 
// cannot convert from String to int

	//	int value3 = 0; // local variable
	
		String value1 = args[0];
		String value2 = args[1]; 
		String value3 = "";
	
		System.out.println(value3);

		value3 = value1;	// 78 = 78
		value1 = value2;// val1 = 56= val2=56
		value2 = value3; // val2 = 78


	System.out.println("Value1 is = " +value1);
	System.out.println("Value2 is = "+value2);




		
	}

}