public class InstructorManager extends UserManager {
    public void salary(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "maas bilgisi : " + instructor.getSalary());
    }
}
