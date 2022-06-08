public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Nida", "Kus", 25, "Java + React");

        Instructor instructor1 = new Instructor(01, "Engin", "Demirog", 35, 9000);

        UserManager userManager = new UserManager();
        userManager.login(student1);
        userManager.login(instructor1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.salary(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.course(student1);

    }
}
