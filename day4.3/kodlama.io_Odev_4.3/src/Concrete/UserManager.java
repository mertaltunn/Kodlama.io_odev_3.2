package Concrete;

import Entities.User;
import Interfaces.UserService;

public class UserManager implements UserService{
	
	@Override
	public void signUp(User user) {
		System.out.println(user.getLastname()+" registered");
		
	}
	@Override
	public void signIn(User user) {
		System.out.println(user.getLastname()+" signed in");
		
	}

	@Override
	public void signOut() {
		System.out.println("signed out");
		
	}

	@Override
	public void addCashtoWallet(int dollarCount) {
		//work on progress
		
	}


}
