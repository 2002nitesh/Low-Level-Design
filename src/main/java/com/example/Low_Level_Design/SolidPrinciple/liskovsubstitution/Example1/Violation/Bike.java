package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example1.Violation;

// BAD: This design violate LSP
public interface Bike {
    void turnOnEngine();
    void turnOffEngine();
    void accelerate();
    void applyBrakes();
}
