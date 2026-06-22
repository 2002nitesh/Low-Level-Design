package com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.solution;

import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.Keyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.Mouse;

public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
