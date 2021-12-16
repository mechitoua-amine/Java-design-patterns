package design.mechitoua.patterns.creational.prototype;

import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentDAO studentDAO = new StudentDAO();
        List<Student> allStudents = studentDAO.getAllStudents();
        System.out.println("Original Student List::");
        allStudents.forEach(System.out::println);

        List<Student> updatedStudentList = studentDAO.clone();
        Student student = new Student();
        student.setId(3);
        student.setName("mehmet");

        System.out.println("Original Student List::");
        updatedStudentList.add(student);

        System.out.println("Updated Student List::");
        updatedStudentList.forEach(System.out::println);
    }
}
