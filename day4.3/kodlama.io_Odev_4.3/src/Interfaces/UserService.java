package Interfaces;

import Entities.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	void signOut();
	void addCashtoWallet(int dollarCount);
}
