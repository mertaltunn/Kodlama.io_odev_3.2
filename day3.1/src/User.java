
public class User {

	private String firstName;
	private String lastName;
	private String id; // �st�nde hi�bir i�lem yap�lmayaca��n� d���nerek "String" t�r�nde yarat�ld�.
	private String eMail;
	private String password;

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}

	public User(String firstName, String lastName, String id, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.eMail = eMail;
		this.password = password;
	}
}
