package com.example.Low_Level_Design.SolidPrinciple.interfaceSegregation.solution;

public class Chef implements ChefTask{
    @Override
    public void decideMenu() {
        System.out.println("Decide Menu");
    }

    @Override
    public void prepareOrder() {
        System.out.println("Prepare Order..");
    }
}
