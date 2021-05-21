import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    List<Course> courses=new ArrayList<Course>();
	
	public void add(Course course) {
		courses.add(course);
		System.out.println(course.name+" eklendi");
	}
	
	public void update(int courseId){
		//update
	}
	
   public void delete(int courseId){
	   courses.remove(courseId);
	}

   public Course getById(int courseId){
   return courses.get(courseId);
}

   public Course[] getAll() {
   return null;
    }
}
