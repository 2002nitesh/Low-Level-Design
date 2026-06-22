package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.problem;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        vehicle = new SportsVehicle();
        vehicle.drive();

        vehicle = new PassenserVehicle();
        vehicle.drive();

        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
