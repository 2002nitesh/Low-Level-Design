package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public class VeggiTopping extends ToppingDecorator {

    public VeggiTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Veggi";
    }

    @Override
    public int getAmout() {
        return pizza.getAmout()+20;
    }
}
