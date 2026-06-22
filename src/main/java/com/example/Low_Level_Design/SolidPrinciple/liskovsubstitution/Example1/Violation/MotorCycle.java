package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Violation;

public class MotorCycle implements Bike {
    String company;
    Boolean isEngineTurnOn;
    int speed;

    public MotorCycle(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        this.isEngineTurnOn = true;
        System.out.println("Turning on...");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineTurnOn = false;
        System.out.println("Turning off...");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Accelerating.........");
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5;
        System.out.println("Braking.........");
    }
}
