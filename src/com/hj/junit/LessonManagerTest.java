package com.hj.junit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.hj.dao.LessonManager;

public class LessonManagerTest {

    @Test
    public void testCreateLessonWithinLimit() {
        LessonManager lessonManager = new LessonManager();
        lessonManager.createLesson("Lesson 1");
        lessonManager.createLesson("Lesson 2");
        lessonManager.createLesson("Lesson 3");
        lessonManager.createLesson("Lesson 4");
        List<String> lessonList = lessonManager.lessonList;
        assertEquals(4, lessonList.size());
    }

    @Test
    public void testCreateLessonExceedLimit() {
        LessonManager lessonManager = new LessonManager();
        lessonManager.createLesson("Lesson 1");
        lessonManager.createLesson("Lesson 2");
        lessonManager.createLesson("Lesson 3");
        lessonManager.createLesson("Lesson 4");
        lessonManager.createLesson("Lesson 5");
        List<String> lessonList = lessonManager.lessonList;
        assertEquals(4, lessonList.size());
    }
    
    
}

