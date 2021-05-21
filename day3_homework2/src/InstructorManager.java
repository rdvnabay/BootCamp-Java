public class InstructorManager extends UserManager{

	public void add(Instructor instructor) {}

	public void addMultiple(Instructor[] instructors) {
		for(Instructor instructor:instructors) {
			add(instructor);
		}
	}
}
