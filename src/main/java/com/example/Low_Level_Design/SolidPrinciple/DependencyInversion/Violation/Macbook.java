package com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.Violation;

import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.Keyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.Mouse;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredKeyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredMouse;

public class Macbook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook(WiredKeyboard keyboard, WiredMouse mouse) {
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
