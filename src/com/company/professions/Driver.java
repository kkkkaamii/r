package com.company.professions;

public class Driver {
    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
