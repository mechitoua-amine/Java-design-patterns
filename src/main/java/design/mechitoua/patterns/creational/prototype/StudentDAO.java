package design.mechitoua.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {
    private static List<Student> studentList;
    static {
        studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("John");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Mary");

        studentList.add(student1);
        studentList.add(student2);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public List<Student> clone() throws CloneNotSupportedException {
        List<Student> clonedStudentList = new ArrayList<>();

        for (Student student : studentList) {
            clonedStudentList.add(student);
        }

        return clonedStudentList;
    }
}
