
public class InstructorManager extends UserManager {

	public void addAssignment(Instructor instructor, Course course) {
		System.out
				.println("Say�n " + instructor.getLastName() + " " + course.getName() + " isimli kursa �dev eklediniz");
	}

	public void addCourse(Instructor instructor, Course course) {
		System.out.println("Say�n " + instructor.getLastName() + " " + course.getName() + " isimli kursu olu�turdunuz"); // Linked
																													// List
																													// gibi
																													// yap�lara
																													// izin
																													// verilmedi�i
																													// i�in
																													// sadece
																													// g�stermelik
																													// olarak
																													// olu�turuldu.
	}
}
