package com.hj.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReportController {

	 public static void monthlyLearnerReport() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month number (e.g., 03 for March): ");
	        String month = scanner.nextLine();

	        // Assuming learner information is stored in a database or data structure
	        // Retrieving learner information for the specified month
	        // For demonstration, let's assume a learner has booked, cancelled, and attended lessons

	        // Replace this block with retrieving learner information for the specified month
	        // For demonstration, using mock learner data
	        String[][] learnerData = {
	                {"John", "01/03", "Grade 1", "Helen", "booked"},
	                {"John", "03/03", "Grade 1", "Helen", "attended"},
	                {"John", "07/03", "Grade 2", "Helen", "cancelled"},
	                {"John", "14/03", "Grade 2", "Helen", "booked"},
	                {"John", "21/03", "Grade 2", "Helen", "attended"},
	                {"John", "28/03", "Grade 3", "Helen", "booked"},
	                // Add more learner data as needed
	        };

	        // Printing learner report for each week in the month
	        for (int week = 1; week <= 4; week++) {
	            System.out.println("Week " + week + " of " + month + ":");

	            int bookedCount = 0;
	            int cancelledCount = 0;
	            int attendedCount = 0;

	            for (String[] learner : learnerData) {
	                if (learner[1].startsWith(month + "/" + week)) {
	                    String status = learner[4];
	                    System.out.println("Lesson on " + learner[1] + " - Grade " + learner[2] + " with Coach " + learner[3] + " - " + status);
	                    if (status.equals("booked")) {
	                        bookedCount++;
	                    } else if (status.equals("cancelled")) {
	                        cancelledCount++;
	                    } else if (status.equals("attended")) {
	                        attendedCount++;
	                    }
	                }
	            }

	            System.out.println("Booked: " + bookedCount);
	            System.out.println("Cancelled: " + cancelledCount);
	            System.out.println("Attended: " + attendedCount);
	            System.out.println();
	        }
	    }
	    
	    
	    public static void monthlyCoachReport() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the month number (e.g., 03 for March): ");
	        String month = scanner.nextLine();

	        // Assuming coach ratings are stored in a database or data structure
	        // Retrieving coach ratings for the specified month
	        // For demonstration, let's assume coach ratings are stored in a map

	        // Replace this block with retrieving coach ratings for the specified month
	        // For demonstration, using mock coach ratings
	        Map<String, Integer[]> coachRatings = new HashMap<>();
	        coachRatings.put("Helen", new Integer[]{5, 4, 3});
	        coachRatings.put("John", new Integer[]{4, 4, 5, 5});
	        coachRatings.put("Emily", new Integer[]{3, 3, 4, 4, 5});

	        // Printing coach report with average ratings for each coach
	        System.out.println("Monthly Coach Report for " + month + ":");
	        for (Map.Entry<String, Integer[]> entry : coachRatings.entrySet()) {
	            String coachName = entry.getKey();
	            Integer[] ratings = entry.getValue();
	            double averageRating = calculateAverageRating(ratings);
	            System.out.println(coachName + ": Average Rating = " + averageRating);
	        }
	    }
	    
	    private static double calculateAverageRating(Integer[] ratings) {
	        int sum = 0;
	        for (int rating : ratings) {
	            sum += rating;
	        }
	        return (double) sum / ratings.length;
	    }
	    
}
