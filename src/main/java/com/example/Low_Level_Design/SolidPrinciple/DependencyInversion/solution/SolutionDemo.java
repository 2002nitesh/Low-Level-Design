package com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.solution;

import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredKeyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WiredMouse;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WirelessKeyboard;
import com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode.WirelessMouse;

public class SolutionDemo {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard("Wired", "HP", "Keyboard2021", "white");
        WiredMouse wiredMouse = new WiredMouse("Wired", "HP", "Mouse2021", "white");

        WirelessKeyboard wirelessKeyboard = new WirelessKeyboard("Bluetooth", "Zebronics", "Keyboard2026", "Black");
        WirelessMouse wirelessMouse = new WirelessMouse("Bluetooth", "Zebronics", "Mouse2026", "Black");

        Macbook macbook = new Macbook(wiredKeyboard, wiredMouse);
        macbook.getKeyboard().getSpecifications();
        macbook.getMouse().getSpecifications();

        Macbook macbook2 = new Macbook(wirelessKeyboard, wiredMouse);
        macbook2.getMouse().getSpecifications();
        macbook2.getKeyboard().getSpecifications();
    }
}
