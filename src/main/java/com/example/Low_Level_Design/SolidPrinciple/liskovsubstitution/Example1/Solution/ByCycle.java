package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Solution;

public class ByCycle extends Bike{
    String brand;
    Boolean hasGears;
    int speed;

    public ByCycle(String brand, Boolean hasGears, int speed){
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Accelerate " + this.brand + " " + this.speed);
    }

    @Override
    public void applyBrake() {
        this.speed = this.speed - 5;
        System.out.println("Apply Brake " + this.brand + " " + this.speed);
    }
}
