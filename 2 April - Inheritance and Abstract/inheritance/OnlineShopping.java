package com.bmpl.inheritance;

public class OnlineShopping {

	void search(String brandwise){
		System.out.println("Fetch the data acc to brand" + brandwise);
	}
	
	void search(int minPrice, int maxPrice){
		System.out.println("Fetch the data acc. to price");
	}
	
	void search(String brandwise, int price){
		System.out.println("Fetch the data acc. to brand and price" + brandwise + price);
	}
	
//	void search(String brandwise, int price){
//		System.out.println("Fetch the data acc. to brand and price" + brandwise + price);
//	}
	
	
	public static void main(String[] args) {
		

	}

}
