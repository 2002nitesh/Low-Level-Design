package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Solution;

public class MotorCycle extends Bike implements Engine {
    String company;
    Boolean isEngineTurnOn;
    int speed;

    public MotorCycle(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Motor Cycle accelerate " + this.company + " " + this.speed);
    }

    @Override
    public void applyBrake() {
        this.speed = this.speed -5;
        System.out.println("Motor Cycle applyBrake " + this.company + " " + this.speed);
    }

    @Override
    public void turnOnEngine() {
        this.isEngineTurnOn = true;
        System.out.println("Turn On Engine " + this.company + " " + this.speed);
    }

    @Override
    public void turnOffEngine() {
        this.isEngineTurnOn = false;
        System.out.println("Turn Off Engine " + this.company + " " + this.speed);
    }
}
