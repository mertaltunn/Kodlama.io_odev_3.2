
public class StudentManager extends UserManager {

	public void enrollCourse(Student student, Course course) {
		student.setEnrolledCourse(course.getName());
		System.out.println(
				"Say�n " + " " + student.getLastName() + " " + course.getName() + " kursuna kayd�n�z tamamlanm��t�r.");
	}

}
