package com.bmpl.interfaces;

public interface SocialMedia extends LeaderBoard{

	int score(int score);
	
	boolean facebookLogin();
	
	boolean instagramLogin();
	
	default void show(){
		System.out.println("SocialMedia");
	}
	
	static void data(){
		System.out.println("Inside SocialMedia");
	}
}
