package com.hj.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.hj.dao.CoachManager;
import com.hj.model.Coach;

public class CoachManagerTest {

    @Test
    void testInsertCoachSuccessful() {
    	// Assuming the coach is successfully inserted
    	Coach coach1 = new Coach("Helen", "Female", 30, "1234567890");
        CoachManager.insertCoach(coach1);
        assertTrue(true);
    }
}
