package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class MushrumTopping extends ToppingDecorator {
    public MushrumTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrum";
    }

    @Override
    public int getAmout() {
        return pizza.getAmout() + 30;
    }
}
