package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine motor;

    public Car(String brand, String carClass, double weight, Driver driver, Engine motor) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car Info: [Brand: " + brand + ", Class: " + carClass + ", Weight: " + weight +
                ", Driver: " + driver.getFullName() + ", Motor: " + motor.getPower() + " " +
                motor.getManufacturer() + "]";
    }
}
