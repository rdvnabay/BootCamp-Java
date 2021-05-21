import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    List<Instructor> instructors = new ArrayList<Instructor>();

    public void add(Instructor instructor) {
        instructors.add(instructor);
        System.out.println(instructor.name + " eklendi");
    }

    public void update(int instructorId) {
        // update
    }

    public void delete(int instructorId) {
        instructors.remove(instructorId);
        System.out.println(instructorId + " numaralı eğitmen silindi");
    }

    public Instructor getById(int instructorId) {
        return instructors.get(instructorId);
    }

    public Instructor[] getAll() {
        return null;
    }
}
