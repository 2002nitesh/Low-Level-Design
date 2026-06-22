package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies;

public class NormalDrive implements DriveStretegy {
    @Override
    public void drive() {
        System.out.println("Drive mode: Normal");
    }
}
