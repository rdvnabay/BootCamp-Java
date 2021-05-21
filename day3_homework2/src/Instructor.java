public class Instructor extends User {
	// fields
	private String courseName;
	private String about;

	// constructor
	public Instructor() {}

	public Instructor(String courseName, String about) {
		super();
		this.courseName = courseName;
		this.about = about;
	}

	// getter setter methods
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
