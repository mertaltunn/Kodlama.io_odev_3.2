
public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor("engin", "demiroğ", "1", "@", "asdasdasd");
		Student student1 = new Student("mert", "altun", "1", "@", "asdasd");

		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		userManager.addUser(instructor);

		Course course1 = new Course("Java Eğitimi...", "1");
		Course course2 = new Course("C# Eğitimi...", "2");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor, course1);
		instructorManager.addCourse(instructor, course2);
		instructorManager.addAssignment(instructor, course1);

		StudentManager studentManager = new StudentManager();
		studentManager.enrollCourse(student1, course1);

	}

}
