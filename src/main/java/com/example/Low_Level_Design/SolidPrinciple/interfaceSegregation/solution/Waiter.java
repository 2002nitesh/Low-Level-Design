package com.example.Low_Level_Design.SolidPrinciple.interfaceSegregation.solution;

public class Waiter implements WaiterTask{
    @Override
    public void serverFoodAndDrinks() {
        System.out.println("Server Food and Drinks");
    }

    @Override
    public void takeOrder() {
        System.out.println("Take Order");
    }
}
