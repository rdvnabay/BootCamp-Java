public class Student extends User {
	// fields
	private String homework;
	private String comment;

	// constructor
	public Student() {}

	public Student(String homework, String comment) {
		super();
		this.homework = homework;
		this.comment = comment;
	}

	// getter setter methods
	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
