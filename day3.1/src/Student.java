
public class Student extends User {

	public Student(String firstName, String lastName, String id, String eMail, String password) {
		super(firstName, lastName, id, eMail, password);
	}

	private String enrolledCourse;// "Array list" yap�s�n� kullanacakt�m ancak sadece kursta g�rd���m�z yap�lar
									// istendi�i i�in sadece "String" t�r�nde yaratt�m.

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

}
