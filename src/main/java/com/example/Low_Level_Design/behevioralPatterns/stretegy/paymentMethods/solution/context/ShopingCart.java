package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.context;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy.PaymentStretegy;

public class ShopingCart {
    private PaymentStretegy paymentStretegy;

    public void setPaymentStretegy(PaymentStretegy paymentStretegy) {
        this.paymentStretegy = paymentStretegy;
    }

    public void checkout(double amount) {
        System.out.print(this.getClass().getSimpleName() + " : ");
        paymentStretegy.pay(amount);
    }
}
