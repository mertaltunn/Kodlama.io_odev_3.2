package dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.User;

public interface UserDao {

	List<User> users = new ArrayList();
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
}
