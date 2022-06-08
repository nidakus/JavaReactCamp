public class StudentManager extends UserManager {
    public void course(Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getCourse() + " " + "kursunu favorilere ekledi.");
    }
}
