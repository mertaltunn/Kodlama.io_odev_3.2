package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(String mail, String password);
	void update(User user);
	void delete(User user);
	
}
