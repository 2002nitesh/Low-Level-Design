package com.example.Low_Level_Design.SolidPrinciple.interfaceSegregation.solution;

public class SolutionDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        waiter.serverFoodAndDrinks();
        waiter.takeOrder();

        chef.decideMenu();
        chef.prepareOrder();
    }
}
