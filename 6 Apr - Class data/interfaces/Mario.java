package com.bmpl.interfaces;



public class Mario implements Game, SocialMedia{

	int currentLife = MAX_LIFE;
	
	@Override
	public void idle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		currentLife--;
		//0==0
		if(currentLife>=MIN_LIFE){
			System.out.println("Game Over");
		}
	}

	@Override
	public boolean facebookLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean instagramLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void score() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int score(int score) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void profilePic() {
		
		SocialMedia.data();
		LeaderBoard.data();
		// static type --> that method is going to be called with the name of class or interface inside which its declared
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	

}
