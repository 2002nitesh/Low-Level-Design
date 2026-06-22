package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class FarmHousePizza implements BasePizza {
    @Override
    public String getDescription() {
        return "FarmHousePizza";
    }

    @Override
    public int getAmout() {
        return 150;
    }
}
