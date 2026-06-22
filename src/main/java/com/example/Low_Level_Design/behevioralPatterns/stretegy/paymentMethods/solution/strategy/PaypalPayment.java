package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy;

public class PaypalPayment implements PaymentStretegy{
    private String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with paypal account "+ email);
    }
}
