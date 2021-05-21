public class App {
    public static void main(String[] args) throws Exception {
        // Student
        Student student1 = new Student("Ödev-1", "Yorum-1");
        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Rıdvan");
        student2.setLastName("Abay");
        student2.setEmail("ridvanabay@gmail.com");
        student2.setPassword("1234");
        student2.setComment("Yorum-2");
        student2.setHomework("Ödev-2");

        // Instructor
        Instructor instructor1 = new Instructor("C#-Angular", "Yazılım Geliştiricisi");
        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("Engin");
        instructor2.setLastName("Demiroğ");
        instructor2.setEmail("engindemirog@gmail.com");
        instructor2.setPassword("1234");
        instructor2.setCourseName("Java_React");
        instructor2.setAbout("Yazılım Geliştiricisi");

        UserManager userManager = new UserManager();
        userManager.add(student1);
        userManager.add(student2);
        userManager.add(instructor1);
        userManager.add(instructor2);

        User[] users = new User[] { student1, student2, instructor1, instructor2 };
        userManager.addMultiple(users);
    }
}
