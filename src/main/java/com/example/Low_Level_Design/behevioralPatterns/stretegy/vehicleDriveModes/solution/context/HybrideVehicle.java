package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.DriveStretegy;

public class HybrideVehicle extends Vehicle{
    public HybrideVehicle(DriveStretegy driveStretegy) {
        super(driveStretegy);
    }
}
