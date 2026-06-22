package com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.Violation;

import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredKeyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredMouse;

public class ViolationDemo {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("Wired", "HP", "2026", "Black");
        WiredMouse wiredMouse = new WiredMouse("Wired", "HP", "2026", "White");

        Macbook macbook = new Macbook(wiredKeyboard, wiredMouse);
        macbook.getKeyboard().getSpecifications();
        macbook.getMouse().getSpecifications();
    }
}
