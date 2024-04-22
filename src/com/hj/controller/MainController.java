package com.hj.controller;

import java.util.Scanner;

import com.hj.dao.LessonManager;
import com.hj.dao.TimeTableManager;

public class MainController {

	public static void hjssHome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hatfield Junior Swimming School (HJSS), Please select one of the following choices.");
        System.out.println("1. Book a swimming lesson");
        System.out.println("2. Change/Cancel a booking");
        System.out.println("3. Attend a swimming lesson");
        System.out.println("4. Monthly learner report");
        System.out.println("5. Monthly coach report");
        System.out.println("6. Register a new learner");
        System.out.println("7. Do you want to Exit.");
        System.out.print("Enter your choice (1/2/3/4/5/6): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                BookingController.bookSwimmingLesson();
                break;
            case 2:
            	BookingController.changeOrCancelBooking();
                break;
            case 3:
            	BookingController.attendSwimmingLesson();
                break;
            case 4:
            	ReportController.monthlyLearnerReport();
                break;
            case 5:
            	ReportController.monthlyCoachReport();
                break;
            case 6:
            	StudentController.insertStudentData();
                break;
                case 7:
            	System.out.println("Program exit successful.");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
	}
	
	public static void main(String arg[]) {
		//pre requisits
		TimeTableManager.timeTable();
		LessonManager.populateLessons();
		LessonManager.createVacancies();
		hjssHome();
	}
}
