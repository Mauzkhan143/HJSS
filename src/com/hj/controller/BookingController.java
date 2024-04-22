package com.hj.controller;

import static com.hj.controller.MainController.hjssHome;
import java.util.Scanner;

import com.hj.dao.LessonManager;
import com.hj.dao.TimeTableManager;

public class BookingController {
	

	public static void bookSwimmingLesson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How would you like to view the timetable?");
        System.out.println("1. By specifying the day");
        System.out.println("2. By specifying the grade level");
        System.out.println("3. By specifying the coach's name");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the day (e.g., Monday): ");
                String day = scanner.nextLine();
                TimeTableController.viewTimeTable("day", day);
                break;
            case 2:
                System.out.print("Enter the grade level (e.g., 1): ");
                String grade = scanner.nextLine();
                TimeTableController.viewTimeTable("grade", grade);
                break;
            case 3:
                System.out.print("Enter the coach's name (e.g., Helen): ");
                String coach = scanner.nextLine();
                TimeTableController.viewTimeTable("coach", coach);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter the lesson you want to book: ");
        String lessonToBook = scanner.nextLine();

        // Check if lesson can be booked
        if (canBookLesson(lessonToBook)) {
            bookLesson(lessonToBook);
        } else {
            System.out.println("Booking unsuccessful. Lesson is full or invalid.");
            hjssHome();
        }
    }
	
    public static void changeOrCancelBooking() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the booking ID you want to change/cancel: ");
        String bookingID = scanner.nextLine();

        // Check if the booking ID exists
        if (LessonManager.bookedLessons.containsKey(bookingID)) {
            String currentLesson = LessonManager.bookedLessons.get(bookingID);
            System.out.println("Current booked lesson: " + currentLesson);

            System.out.println("How would you like to view the timetable?");
            System.out.println("1. By specifying the day");
            System.out.println("2. By specifying the grade level");
            System.out.println("3. By specifying the coach's name");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the day (e.g., Monday): ");
                    String day = scanner.nextLine();
                    TimeTableController.viewTimeTable("day", day);
                    break;
                case 2:
                    System.out.print("Enter the grade level (e.g., 1): ");
                    String grade = scanner.nextLine();
                    TimeTableController.viewTimeTable("grade", grade);
                    break;
                case 3:
                    System.out.print("Enter the coach's name (e.g., Helen): ");
                    String coach = scanner.nextLine();
                    TimeTableController.viewTimeTable("coach", coach);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            System.out.print("Enter the new lesson you want to book: ");
            String newLesson = scanner.nextLine();

            // Check if new lesson can be booked
            if (IsLessonBooked(newLesson)) {
                // Release one place from the previously booked lesson
            	LessonManager.vacancies.put(newLesson, 0);
                // Book the new lesson
                bookLesson(newLesson);
                // Remove the old booking
                LessonManager.bookedLessons.remove(bookingID);
                System.out.println("Change successful.");
                hjssHome();
            } else {
                LessonManager.createVacancies();
                LessonManager.vacancies.put(newLesson, 1);
                System.out.println("Change successful.");
                hjssHome();
            }
        } else {
            System.out.println("Booking ID not found.");
        }
    }
    public static boolean IsLessonBooked(String lesson){
        if (LessonManager.vacancies.get(lesson) ==0) {
            return true;
        }else{
            return false;
        }
    }
    public static void attendSwimmingLesson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the booking ID of the lesson you want to attend: ");
        String bookingID = scanner.nextLine();

        // Check if the booking ID exists
        if (LessonManager.bookedLessons.containsKey(bookingID)) {
            String bookedLesson = LessonManager.bookedLessons.get(bookingID);
            System.out.println("Attending lesson: " + bookedLesson);

            System.out.println("Please write a review for the lesson:");
            String review = scanner.nextLine();

            System.out.println("Please provide a numerical rating for the coach (1 to 5):");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Update booking status to "attended"
            LessonManager.updateBookingStatus(bookingID, "attended");

            // Record review and rating in the system (This could involve database updates or file writing)
            System.out.println("Review: " + review);
            System.out.println("Rating: " + rating);
            System.out.println("Thank you for attending the lesson.");
            hjssHome();
        } else {
            System.out.println("Booking ID not found.");
            hjssHome();
        }
    }


    private static boolean canBookLesson(String lesson) {
        // Check if lesson exists and has vacancies
//        System.out.println("lesson : "+lesson);
        if (LessonManager.vacancies.containsKey(lesson)) {
            int vacancies = LessonManager.vacancies.getOrDefault(LessonManager.vacancies.get(lesson), 0);
            return vacancies<4;
        }
        return false;
    }

    private static void bookLesson(String lesson) {
        // Existing code to book lesson
    	LessonManager.vacancies.put(lesson, LessonManager.vacancies.get(lesson) + 1);
        LessonManager.bookedLessons.put(lesson, ""+LessonManager.vacancies.get(lesson));
        // Update vacancies and bookedLessons maps
        // Implement according to your system requirements
        System.out.println("Lesson '" + lesson + "' booked successfully.");
        hjssHome();
    }
}
