package com.hj.dao;

import java.util.ArrayList;
import java.util.List;

import com.hj.model.Student;

public class StudentManager {
    private static List<Student> studentList = new ArrayList<>();

    public static void insertStudent(Student student) {
        if (student.getAge() >= 4 && student.getAge() <= 11) {
            studentList.add(student);
            System.out.println("Student '" + student.getName() + "' added successfully.");
        } else {
            System.out.println("Student age must be between 4 and 11.");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        Student student1 = new Student("John", "Male", 8, "0123456789", "john@example.com", "Grade 3");
        insertStudent(student1);

        Student student2 = new Student("Emma", "Female", 12, "9876543210", "emma@example.com", "Grade 6");
        insertStudent(student2);
    }
}