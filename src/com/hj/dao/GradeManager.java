package com.hj.dao;

import java.util.HashMap;
import java.util.Map;

public class GradeManager {
	private static Map<String, Integer> gradeLevel = new HashMap<>();

	public static void insertGrades() {
		//current grade level [0, 5]
		gradeLevel.put("Grade 0", 0);
		gradeLevel.put("Grade 1", 1);
		gradeLevel.put("Grade 2", 2);
		gradeLevel.put("Grade 3", 3);
		gradeLevel.put("Grade 4", 4);
		gradeLevel.put("Grade 5", 5);

	}
}