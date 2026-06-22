package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.problem;

public class PaymentProcessor {
    public void processPayment(String type, int amount){
        switch (type){
            case "credit_card" -> System.out.println("Paid $" + amount + " via mode "+ type);
            case "paypal" -> System.out.println("Paid $" + amount + " via mode "+ type);
            case "net_banking" -> System.out.println("Paid $" + amount + " via mode "+ type);
            case "case" -> System.out.println("Paid $" + amount + " via mode "+ type);
            default -> throw new IllegalArgumentException("Invalid type: " + type);
        }
    }
}
