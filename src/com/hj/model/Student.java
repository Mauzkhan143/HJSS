package com.hj.model;

public class Student {
    private String name;
    private String gender;
    private int age;
    private String emergencyContact;
    private String phoneNumber;
    private String currentGradeLevel;

    // Constructors
    public Student() {
    }

    public Student(String name, String gender, int age, String emergencyContact, String phoneNumber, String currentGradeLevel) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.emergencyContact = emergencyContact;
        this.phoneNumber = phoneNumber;
        this.currentGradeLevel = currentGradeLevel;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCurrentGradeLevel() {
        return currentGradeLevel;
    }

    public void setCurrentGradeLevel(String currentGradeLevel) {
        this.currentGradeLevel = currentGradeLevel;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", currentGradeLevel='" + currentGradeLevel + '\'' +
                '}';
    }
}