package com.example.Low_Level_Design.SolidPrinciple.interfaceSegregation.violation;

public class Waiter implements ResorentEmployee{

    @Override
    public void prepareFood() {
        throw new AssertionError("Waiter can't prepare food...");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Waiter can't decide menu...");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Waiter serve food and drinks...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter take order...");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Waiter can't clean Kitchen...");
    }
}
