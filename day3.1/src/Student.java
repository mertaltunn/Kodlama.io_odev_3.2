
public class Student extends User {

	public Student(String firstName, String lastName, String id, String eMail, String password) {
		super(firstName, lastName, id, eMail, password);
	}

	private String enrolledCourse;// "Array list" yapýsýný kullanacaktým ancak sadece kursta gördüðümüz yapýlar
									// istendiði için sadece "String" türünde yarattým.

	public String getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

}
