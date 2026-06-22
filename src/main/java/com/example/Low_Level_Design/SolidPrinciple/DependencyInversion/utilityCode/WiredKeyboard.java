package com.example.Low_Level_Design.SolidPrinciple.DependencyInversion.utilityCode;

public class WiredKeyboard implements Keyboard {
    private final String connectionType;
    private final String company;
    private final String modelVersion;
    private final String color;

    public WiredKeyboard(String connectionType, String company, String modelVersion, String color) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelVersion = modelVersion;
        this.color = color;
    }

    @Override
    public void getSpecifications() {
        System.out.println("Wired Keyboard");
        System.out.println("connectionType: " + connectionType);
        System.out.println("company: " + company);
        System.out.println("modelVersion: " + modelVersion);
        System.out.println("color: " + color);
    }
}
