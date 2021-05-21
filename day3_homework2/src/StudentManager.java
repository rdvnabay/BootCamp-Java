public class StudentManager extends UserManager {
	
	public void add(Student student) {

	}

	public void addMultiple(Student[] students) {
		for (Student student : students) {
			add(student);
		}
	}
}
