import business.concretes.UserManager;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new HibernateProductDao());
		
		User user1 = new User(1, "mert", "altun", "mertaltun020@gmail.com", "1234567");
		userManager.signUp(user1);
	}

}
