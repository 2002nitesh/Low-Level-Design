package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Violation;

public class ViolateDemo {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("Royal Enfield", 100);
        ByCycle byCycle = new ByCycle("Hero", true, 20);

        motorCycle.turnOnEngine();
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();

        byCycle.turnOnEngine();
        byCycle.turnOffEngine();
        byCycle.accelerate();
        byCycle.applyBrakes();
    }
}
