package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
public class UserManager implements UserService{
	
	private UserDao userDao;
	ControlManager controlManager = new ControlManager();
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public void signUp(User user) {
		while (controlManager.allControls == true) {
			controlManager.emailControl(user.geteMail());
			controlManager.nameControl(user);
			controlManager.passwordControl(user);
			controlManager.mailVerification(user);
			userDao.add(user);
			System.out.println("Ba�ar�l� bir �ekilde kay�t oldunuz.");
		}
		
		
	}
	@Override
	public void signIn(String email, String password) {
		for (int i = 0; i < userDao.users.size(); i++) {
			if (userDao.users.get(i).geteMail()==email) {
				if (userDao.users.get(i).getPassword()==password) {
					System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z");
						break;
				}
				else {
					System.out.println("Giri� ba�ar�s�z");
					break;
				}
			}
		}
		
	}
	@Override
	public void update(User user) {
		//work in progress
	}
	@Override
	public void delete(User user) {
		userDao.delete(user);
	}
	
	

}
