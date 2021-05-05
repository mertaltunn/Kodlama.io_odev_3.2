
public class InstructorManager extends UserManager {

	public void addAssignment(Instructor instructor, Course course) {
		System.out
				.println("Sayýn " + instructor.getLastName() + " " + course.getName() + " isimli kursa ödev eklediniz");
	}

	public void addCourse(Instructor instructor, Course course) {
		System.out.println("Sayýn " + instructor.getLastName() + " " + course.getName() + " isimli kursu oluþturdunuz"); // Linked
																													// List
																													// gibi
																													// yapýlara
																													// izin
																													// verilmediði
																													// için
																													// sadece
																													// göstermelik
																													// olarak
																													// oluþturuldu.
	}
}
