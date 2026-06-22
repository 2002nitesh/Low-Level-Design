package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.DriveStretegy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStretegy driveStretegy) {
        super(driveStretegy);
    }
}
