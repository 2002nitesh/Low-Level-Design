package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.DriveStretegy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DriveStretegy driveStretegy) {
        super(driveStretegy);
    }
}
