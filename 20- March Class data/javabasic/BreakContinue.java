package com.bmpl.javabasic;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int k =1; k<=5; k++){
		
			for(int i =1; i<=10; i++){
				
				if(i==5){ // 5==5
					break;
					//continue;// skip the current itreation
					//System.out.println("any message");
				}
				System.out.println(i);
			}
			
		}
		

	}

}
