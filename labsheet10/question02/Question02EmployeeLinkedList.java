package labsheet10.question02;

import java.util.LinkedList;

public class Question02EmployeeLinkedList {
    private LinkedList<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public void searchByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.display();
            }
        }
    }

    public static void main(String[] args) {
        Question02EmployeeLinkedList manager = new Question02EmployeeLinkedList();
        manager.addEmployee(new Employee(101, "Aarav"));
        manager.addEmployee(new Employee(102, "Neha"));
        manager.addEmployee(new Employee(103, "Ravi"));
        manager.displayEmployees();
        System.out.println("Search by name (Neha):");
        manager.searchByName("Neha");
    }
}
