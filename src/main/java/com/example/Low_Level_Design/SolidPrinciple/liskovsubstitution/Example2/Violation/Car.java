package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Violation;

public class Car extends Vehicle{
    @Override
    int numberOfWheels(){
        return 4;
    }

    String getSpecifications(){
        return "Car has " + numberOfWheels() + " wheels and engine " + hasEngine();
    }
}
