package com.hj.dao;

import java.util.ArrayList;
import java.util.List;

import com.hj.model.Coach;

public class CoachManager {
    private static List<Coach> coachList = new ArrayList<>();

    public static void insertCoach(Coach coach) {
        coachList.add(coach);
        System.out.println("Coach '" + coach.getCoachName() + "' added successfully.");
    }

    public static void main(String[] args) {
        // Example usage:
        Coach coach1 = new Coach("Alice", "Female", 35, "0123456789");
        insertCoach(coach1);

        Coach coach2 = new Coach("Bob", "Male", 40, "9876543210");
        insertCoach(coach2);
    }
}
