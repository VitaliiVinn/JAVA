package automationJava.homework8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {
    //    Створити клас Student, що містить такі характеристики – ім’я, курс.
//    Створити колекцію, яка містить об'єкти класу Student.
//    Напишіть методи: 1) добавляє студента; 2) видаляє студента.
//    Напишіть метод printStudents (List<Student> students, int course), який отримує список
//    студентів та номер курсу. А також друкує на консоль імена тих студентів зі списку, які
//    навчаються на цьому курсі.
    private String name;
    private int course;
    private static List <Student> students = new ArrayList<>();
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course){
                System.out.println(student.name);
            }
        }
    }
    public static void addStudent(Student student) {
        students.add(student);
    }
    public static void removeStudent(Student student) {
        students.remove(student);
    }
}
