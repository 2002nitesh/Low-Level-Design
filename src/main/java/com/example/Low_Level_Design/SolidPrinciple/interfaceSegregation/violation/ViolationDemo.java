package com.example.Low_Level_Design.SolidPrinciple.interfaceSegregation.violation;

public class ViolationDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        waiter.takeOrder();
        waiter.cleanTheKitchen();
        waiter.decideMenu();
        waiter.prepareFood();
        waiter.serveFoodAndDrinks();
    }
}
