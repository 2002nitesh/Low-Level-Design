package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context.GoodsVehicle;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context.HybrideVehicle;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context.OffRoadVehicle;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.context.SportsVehicle;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.EVDrive;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.NormalDrive;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.solution.strategies.SportsDrive;

public class Demo {
    public static void main(String[] args) {
        System.out.println("============== Stretegy pattern ==============");
        System.out.println("Example: Vehicle Drive modes");

        SportsVehicle sportsVehicle = new SportsVehicle(new SportsDrive());
        sportsVehicle.drive();

        GoodsVehicle goodsVehicle = new GoodsVehicle(new NormalDrive());
        goodsVehicle.drive();

        HybrideVehicle hybrideVehicle = new HybrideVehicle(new EVDrive());
        hybrideVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(new SportsDrive());
        offRoadVehicle.drive();
    }
}
