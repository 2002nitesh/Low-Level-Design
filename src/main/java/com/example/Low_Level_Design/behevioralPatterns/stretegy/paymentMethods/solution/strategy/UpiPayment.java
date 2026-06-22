package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy;

public class UpiPayment implements PaymentStretegy{
    private String upiID;

    public UpiPayment(String upiID){
        this.upiID = upiID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + "using upiID "+upiID);
    }
}
