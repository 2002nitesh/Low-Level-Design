package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.DriveStretegy;

public class Vehicle {
    DriveStretegy driveStretegy;

    public Vehicle(DriveStretegy driveStretegy) {
        this.driveStretegy = driveStretegy;
    }

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + " : ");
        driveStretegy.drive();
    }
}
