package labsheet10.question05;

import java.util.HashMap;
import java.util.Map;

public class Question05HashMapStudents {
    private HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(int rollNumber, Student student) {
        students.put(rollNumber, student);
    }

    public void removeStudent(int rollNumber) {
        students.remove(rollNumber);
    }

    public void displayStudents() {
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.print("Roll No: " + entry.getKey() + ", ");
            entry.getValue().display();
        }
    }

    public static void main(String[] args) {
        Question05HashMapStudents manager = new Question05HashMapStudents();
        manager.addStudent(101, new Student("Aarav"));
        manager.addStudent(102, new Student("Neha"));
        manager.addStudent(103, new Student("Ravi"));
        manager.removeStudent(102);
        manager.displayStudents();
    }
}
