
public class Course {
	private String name;
	private String id;// �st�nde hi�bir i�lem yap�lmayaca��n� d���nerek "String" t�r�nde yarat�ld�.
	private String assignments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssignments() {
		return assignments;
	}

	public void setAssignments(String assignments) {
		this.assignments = assignments;
	}

	public Course(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
