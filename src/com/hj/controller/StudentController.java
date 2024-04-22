package com.hj.controller;

import java.util.Scanner;

import com.hj.dao.StudentManager;
import com.hj.model.Student;

public class StudentController {

	public static void insertStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Emergency Contact: ");
        String emergencyContact = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Current Grade Level: ");
        String currentGradeLevel = scanner.nextLine();
        
        Student student = new Student();
        student.setName(name);
        student.setGender(gender);
        student.setAge(age);
        student.setEmergencyContact(emergencyContact);
        student.setPhoneNumber(phoneNumber);
        student.setCurrentGradeLevel(currentGradeLevel);

        StudentManager.insertStudent(student);
	}
}
