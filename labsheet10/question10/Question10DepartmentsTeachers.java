package labsheet10.question10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question10DepartmentsTeachers {
    private ArrayList<Department> departments = new ArrayList<>();
    private HashMap<Department, List<Teacher>> teachersByDepartment = new HashMap<>();

    public void addDepartment(Department department) {
        departments.add(department);
        teachersByDepartment.put(department, new ArrayList<>());
    }

    public void addTeacher(Department department, Teacher teacher) {
        List<Teacher> teachers = teachersByDepartment.get(department);
        if (teachers != null) {
            teachers.add(teacher);
        }
    }

    public void displayAll() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
            List<Teacher> teachers = teachersByDepartment.get(department);
            for (Teacher teacher : teachers) {
                teacher.display();
            }
        }
    }

    public static void main(String[] args) {
        Question10DepartmentsTeachers college = new Question10DepartmentsTeachers();

        Department computerScience = new Department("Computer Science");
        Department mathematics = new Department("Mathematics");
        college.addDepartment(computerScience);
        college.addDepartment(mathematics);

        college.addTeacher(computerScience, new Teacher("Dr. Sharma", "Java"));
        college.addTeacher(computerScience, new Teacher("Prof. Mehta", "Data Structures"));
        college.addTeacher(mathematics, new Teacher("Dr. Patel", "Calculus"));

        college.displayAll();
    }
}
