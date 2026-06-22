package com.example.Low_Level_Design.behevioralPatterns.stretegy.vehicleDriveModes.problem;

public class Vehicle {
    public void drive(){
        System.out.print("\n" + this.getClass().getSimpleName() + " : ");
        System.out.println("Driving mode: Normal");
    }
}
