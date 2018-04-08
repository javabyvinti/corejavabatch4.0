package com.bmpl.interfaces;

public interface LeaderBoard {
	
	void profilePic();

	default void show(){
		System.out.println("Default method");
	}
	
	static void data(){
		System.out.println("Data inside LeaderBoard");
	}
	
}
