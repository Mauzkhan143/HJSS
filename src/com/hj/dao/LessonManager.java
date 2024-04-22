package com.hj.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LessonManager {
	public static List<String> lessonList = new ArrayList<>();
	public static Map<String, Integer> vacancies = new HashMap<>();
	public static Map<String, String> bookedLessons = new HashMap<>();

	public static void createLesson(String lessonName) {
		if (lessonList.size() < 4) {
			lessonList.add(lessonName);
			System.out.println("Lesson '" + lessonName + "' added successfully.");
		} else {
			System.out.println("Cannot add more than 4 lessons.");
		}
	}

	public static void createVacancies() {
		vacancies.put("4-5pm", 1);
		vacancies.put("5-6pm", 2);
		vacancies.put("6-7pm", 3);
	}
	
    public static void updateBookingStatus(String bookingID, String status) {
        // Update the status of the booking identified by bookingID to the specified status
        // This could involve updating a database or data structure in memory
        // Here, we'll just print a message to simulate the update
        System.out.println("Booking ID " + bookingID + " status updated to " + status);
    }

    public static void populateLessons() {
    	createLesson("Lesson 1");
		createLesson("Lesson 2");
		createLesson("Lesson 3");
		createLesson("Lesson 4");
    }
    
	public static void main(String[] args) {
		createLesson("Lesson 1");
		createLesson("Lesson 2");
		createLesson("Lesson 3");
		createLesson("Lesson 4");
		createLesson("Lesson 5"); // This will exceed the limit

		//timeTable();

		// Populate timetable, vacancies, bookedLessons, and gradeLevel maps
		// Example usage:
		//viewTimeTable("day", "Monday");
		//viewTimeTable("grade", "1");
		//viewTimeTable("coach", "Helen");
	}
}
