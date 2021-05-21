public class App {
    public static void main(String[] args) throws Exception {
        // Course
        Course course1 = new Course(1, "Java & React", "Ödev-1", "Engin Demiroğ");
        Course course2 = new Course(2, "C# & Angular", "Ödev-2", "Engin Demiroğ");
        Course course3 = new Course(3, "Asp.Net Mvc Core", "Ödev-3", "Sadık Turan");
        course3.id = 3;
        course3.name = "Veritabanı";

        CourseManager courseManager = new CourseManager();
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.getById(1);
        System.out.println("-------------------------------------------------");

        // Category
        Category category1 = new Category(1, "Backend Programlama");
        Category category2 = new Category(2, "Frontend Programlama");
        Category category3 = new Category();
        category3.id = 3;
        category3.name = "Veritabanı";

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);
        categoryManager.getById(2);

        System.out.println("-------------------------------------------------");

        // Instructor
        Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
        Instructor instructor2 = new Instructor(2, "Sadık Turan");
        Instructor instructor3 = new Instructor();
        instructor3.id = 3;
        instructor3.name = "Muran Başaren";

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);
        instructorManager.getById(2);
        // instructorManager.delete(3);
        System.out.println("-------------------------------------------------");
    }
}
