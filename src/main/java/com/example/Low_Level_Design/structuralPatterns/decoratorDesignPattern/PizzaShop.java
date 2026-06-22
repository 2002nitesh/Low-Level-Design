package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("======= Decorator Pattern =======");
        BasePizza pizza1 = new PlanPizza();
        System.out.println("Order 1 : Description: "+pizza1.getDescription()+ " Cost: "+pizza1.getAmout());

        BasePizza pizza2 = new VeggiTopping(new MushrumTopping(new FarmHousePizza()));
        System.out.println("Order 2 :  Description: "+pizza2.getDescription()+ " Cost: "+pizza2.getAmout());
    }
}
