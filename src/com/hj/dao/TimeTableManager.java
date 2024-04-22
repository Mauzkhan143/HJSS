package com.hj.dao;

import java.util.HashMap;
import java.util.Map;

public class TimeTableManager {
	public static Map<String, String[]> timeTable = new HashMap<>();
	
	public static void timeTable() {
		timeTable.put("Monday", new String[] { "4-5pm", "5-6pm", "6-7pm" });
		timeTable.put("Wednesday", new String[] { "2-3pm", "3-4pm" });
		timeTable.put("Friday", new String[] { "2-3pm", "3-4pm" });
		timeTable.put("Saturday", new String[] { "2-3pm", "3-4pm" });
		
		timeTable.put("Saturday", new String[] { "2-3pm", "3-4pm" });

		// Print the timetable
//		for (Map.Entry<String, String[]> entry : timeTable.entrySet()) {
//			String day = entry.getKey();
//			String[] timings = entry.getValue();
//			System.out.print(day + ": ");
//			for (String timing : timings) {
//				System.out.print(timing + ", ");
//			}
//			System.out.println();
//		}
	}
	
	
}
