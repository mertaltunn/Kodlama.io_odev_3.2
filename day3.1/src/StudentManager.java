
public class StudentManager extends UserManager {

	public void enrollCourse(Student student, Course course) {
		student.setEnrolledCourse(course.getName());
		System.out.println(
				"Sayın " + " " + student.getLastName() + " " + course.getName() + " kursuna kaydınız tamamlanmıştır.");
	}

}
