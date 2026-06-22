package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Solution;

public class Car extends EngineVehicle{
    @Override
    int noOfWheels() {
        return 4;
    }
}
