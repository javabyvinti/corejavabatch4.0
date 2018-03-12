import java.util.Scanner;


class UserInput{

	public static void main(String args[])
	{
		//Step-1: Create object of Scanner class
	// 1 memory of object
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Enter your Phn");
			
	long phn = scanner.nextLong();

	System.out.println("Your Entered phn is = "+phn);

	System.out.println("Enter your name");
	scanner.nextLine();	
	String name = scanner.nextLine();

	System.out.println("Your Entered Name is = "+name);



// next() -> predefined method inside the scanner class
// work with collection of characters before spaces
// input --> Ram Kumar
	
		
	}
}