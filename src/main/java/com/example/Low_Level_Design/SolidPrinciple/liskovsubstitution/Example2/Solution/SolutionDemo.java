package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new ByCycle());

        for  (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.noOfWheels());
        }

        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new MotorCycle());
        engineVehicles.add(new Car());

        for  (EngineVehicle engineVehicle : engineVehicles) {
            System.out.println(engineVehicle.hasEngine().toString());
        }
    }
}
