package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.DriveStretegy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(DriveStretegy driveStretegy) {
        super(driveStretegy);
    }
}
