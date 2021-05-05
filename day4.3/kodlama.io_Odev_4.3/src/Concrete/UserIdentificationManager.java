package Concrete;

import Entities.User;
import Interfaces.UserIdentificationService;

public class UserIdentificationManager implements UserIdentificationService {

	@Override
	public void identify(User user) {
		System.out.println("User checked through 'Mernis web servis'");
		//work on progress
		
	}

}
