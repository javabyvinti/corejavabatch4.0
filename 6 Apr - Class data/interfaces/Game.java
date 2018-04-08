package com.bmpl.interfaces;

// 100% abstract

public interface Game {

	int MIN_LIFE = 1;
	public static final int MAX_LIFE = 3;	// public static final
	
	public abstract void idle();	// public abstract
	
	void walk();
	
	void run();
	
	void attack();
	
	void score();
	
	default void show(){
		System.out.println("Game");
	}
}
