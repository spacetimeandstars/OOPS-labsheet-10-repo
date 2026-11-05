package labsheet10.question01;

import java.util.ArrayList;

public class Question01ArrayListStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aarav"));
        students.add(new Student("Neha"));
        students.add(new Student("Ravi"));

        students.remove(1);
        for (Student student : students) {
            student.display();
        }
    }
}
