package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Violation;

// This class violates LSP!
public class ByCycle implements Bike {
    String brand;
    Boolean hasGears;
    int speed;

    public ByCycle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("ByCycle not has engine.");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("ByCycle not has engine.");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 5;
        System.out.println("Accelerating.........");
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5;
        System.out.println("Braking.........");
    }
}
