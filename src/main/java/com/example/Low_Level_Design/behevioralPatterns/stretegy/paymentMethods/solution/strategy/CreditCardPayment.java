package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy;

public class CreditCardPayment implements PaymentStretegy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with card last 4 number " + cardNumber.substring(cardNumber.length() - 4));
    }
}
