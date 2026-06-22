package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Solution;

public class SolutionDemo {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("TVS", 120);
        ByCycle byCycle = new ByCycle("Tata", true, 15);

        motorCycle.applyBrake();
        motorCycle.turnOffEngine();
        motorCycle.turnOnEngine();
        motorCycle.accelerate();


        byCycle.applyBrake();
        byCycle.accelerate();
    }
}
