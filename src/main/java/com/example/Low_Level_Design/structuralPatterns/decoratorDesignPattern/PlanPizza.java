package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class PlanPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "PlainPizza";
    }

    @Override
    public int getAmout() {
        return 100;
    }
}
