package com.hj.controller;

import java.util.Map;

import com.hj.dao.LessonManager;
import com.hj.dao.TimeTableManager;

public class TimeTableController {

	public static void viewTimeTable(String searchType, String searchValue) {
		// Display timetable according to search type
		switch (searchType.toLowerCase()) {
		case "day":
			displayTimeTableByDay(searchValue);
			break;
		case "grade":
			displayTimeTableByGrade(searchValue);
			break;
		case "coach":
			displayTimeTableByCoach(searchValue);
			break;
		default:
			System.out.println("Invalid search type.");
		}
	}
	
	private static void displayTimeTableByDay(String day) {
		if (TimeTableManager.timeTable.containsKey(day)) {
			String[] lessons = TimeTableManager.timeTable.get(day);
			System.out.println("Timetable for " + day + ":");
			for (String lesson : lessons) {
				System.out.println(lesson + " - Vacancies: " + LessonManager.vacancies.getOrDefault(lesson, 0));
			}
		} else {
			System.out.println("No lessons scheduled for " + day);
		}
	}

	private static void displayTimeTableByGrade(String grade) {
		System.out.println("Timetable for Grade " + grade + ":");
		for (Map.Entry<String, String[]> entry : TimeTableManager.timeTable.entrySet()) {
			String day = entry.getKey();
			String[] lessons = entry.getValue();
			for (String lesson : lessons) {
				if (lesson.contains(grade)) {
					System.out.println(day + ": " + lesson + " - Vacancies: " + LessonManager.vacancies.getOrDefault(lesson, 0));
				}
			}
		}
	}

	private static void displayTimeTableByCoach(String coach) {
		System.out.println("Timetable for Coach " + coach + ":");
		for (Map.Entry<String, String> entry : LessonManager.bookedLessons.entrySet()) {
			String lesson = entry.getValue();
			if (lesson.contains(coach)) {
				System.out.println(entry.getKey() + ": " + lesson);
			}
		}
	}

}
