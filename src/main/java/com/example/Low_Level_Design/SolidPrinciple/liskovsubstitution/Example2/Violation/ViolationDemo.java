package com.example.Low_Level_Design.SolidPrinciple.liskovsubstitution.Example2.Violation;

import java.util.ArrayList;
import java.util.List;

public class ViolationDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new MotorCycle());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.hasEngine().toString());
        }

        List<Vehicle>  vehicles2 = new ArrayList<>();
        vehicles2.add(new Car());
        vehicles2.add(new MotorCycle());
        vehicles2.add(new ByCycle());

        for (Vehicle vehicle : vehicles2) {
            System.out.println(vehicle.hasEngine().toString());
        }

    }
}
