package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Violation;

public class Vehicle {
    int numberOfWheels(){
        return 2;
    }

    Boolean hasEngine(){
        return true;
    }
}
