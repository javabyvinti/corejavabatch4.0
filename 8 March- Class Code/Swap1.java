// swap two values program
// 1. swap with third variable
//2. swap without third variable


class SwapData{

	// java 1.5 version
	static public void main(String... name)
	{
		int value1 = 78;
		int value2 = 56;
		int value3 = 0; // local variable
		
		System.out.println(value3);

		value3 = value1;	// 78 = 78
		value1 = value2;// val1 = 56= val2=56
		value2 = value3; // val2 = 78


	System.out.println("Value1 is = " +value1);
	System.out.println("Value2 is = "+value2);




		
	}

}