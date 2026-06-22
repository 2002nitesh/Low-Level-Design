package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class MargheritaPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "MargheritaPizza";
    }

    @Override
    public int getAmout() {
        return 120;
    }
}
