package com.example.Low_Level_Design.structuralPatterns.decoratorDesignPattern;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
