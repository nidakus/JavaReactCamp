public class Student extends User {

    private String course;

    public Student(int id, String firstName, String lastName, int age, String course) {
        super(id, firstName, lastName, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
