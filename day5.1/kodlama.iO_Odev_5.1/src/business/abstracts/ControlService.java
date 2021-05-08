package business.abstracts;

import entities.concretes.User;

public interface ControlService {



		void emailControl(String email);
		void mailVerification(User user);
		void nameControl(User user);
		void passwordControl(User user);
		 
}
