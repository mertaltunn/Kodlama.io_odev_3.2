package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.ControlService;
import entities.concretes.User;

public class ControlManager implements ControlService {
	
	 boolean allControls = true;

	@Override
	public void emailControl(String email) {
		String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
        Matcher matcher =emailPath.matcher(email);
        if(matcher.find()==false){
            System.out.println("Lütfen geçerli bir email adresi giriniz.");
        }
        else {
			allControls = false;
		}
	}

	@Override
	public void mailVerification(User user) {
		System.out.println(user.geteMail() + " adresine doðrulama maili gönderildi, maildeki linke týklanýnca kayýt tamamlanacak");
	}

	@Override
	public void nameControl(User user) {
		if (user.getFirstName().length()<2 || user.getLastName().length()<2 ) {
			
		}
		else {
			allControls =false;
		}
		
	}

	@Override
	public void passwordControl(User user) {
		if (user.getPassword().length()<6) {
			
		}
		else {
			allControls = false;
		}
		
	}


}
