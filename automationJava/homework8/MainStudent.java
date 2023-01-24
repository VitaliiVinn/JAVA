package automationJava.homework8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Bill", 3);
        Student student1 = new Student("Gimm", 5);
        Student student2 = new Student("Michael", 2);
        Student student3 = new Student("Jimm", 5);
        Student.addStudent(student);
        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);

        Student.removeStudent(student1);
        Student.removeStudent(student3);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Student.printStudents(students, 5);
    }
}
