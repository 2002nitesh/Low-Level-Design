package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.problem;

public class Demo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("credit_card", 1200);
        paymentProcessor.processPayment("paypal", 100);
        paymentProcessor.processPayment("net_banking", 200);
        paymentProcessor.processPayment("case", 120);
        paymentProcessor.processPayment("debit_card", 12);
    }
}
