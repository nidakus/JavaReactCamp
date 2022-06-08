public class Instructor extends User {

    private double salary;

    public Instructor(int id, String firstName, String lastName, int age, double salary) {
        super(id, firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
