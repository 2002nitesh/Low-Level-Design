package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies;

public class EVDrive implements DriveStretegy {

    @Override
    public void drive() {
        System.out.println("Drive mode: Electric");
    }
}
