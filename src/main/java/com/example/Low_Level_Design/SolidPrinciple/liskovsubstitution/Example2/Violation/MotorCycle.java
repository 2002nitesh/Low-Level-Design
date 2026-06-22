package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Violation;

public class MotorCycle extends Vehicle{
    String getSpecifications(){
        return "Motor Cycle has " + numberOfWheels() + " wheels and engine " + hasEngine();
    }
}
