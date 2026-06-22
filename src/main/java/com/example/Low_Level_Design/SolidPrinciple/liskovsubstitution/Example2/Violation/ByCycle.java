package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Violation;

public class ByCycle extends Vehicle{
    @Override
    Boolean hasEngine() {
        return null;
    }

    String getSpecifications(){
        return "Bycycle has " + numberOfWheels() + " wheels and engine " + hasEngine();
    }
}
