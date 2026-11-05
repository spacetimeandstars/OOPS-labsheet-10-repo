package labsheet10.question02;

public class Employee extends Person {
    private int employeeId;

    public Employee(int employeeId, String name) {
        super(name);
        this.employeeId = employeeId;
    }

    @Override
    public void display() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}
