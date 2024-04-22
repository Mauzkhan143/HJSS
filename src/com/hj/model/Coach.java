package com.hj.model;

public class Coach {
    private String coachName;
    private String gender;
    private int age;
    private String phoneNumber;

    // Constructors
    public Coach() {
    }

    public Coach(String coachName, String gender, int age, String phoneNumber) {
        this.coachName = coachName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Coach{" +
                "coachName='" + coachName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
