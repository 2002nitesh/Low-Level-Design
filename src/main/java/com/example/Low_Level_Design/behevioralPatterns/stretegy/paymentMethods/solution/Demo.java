package com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution;

import com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.context.ShopingCart;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy.CreditCardPayment;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy.PaypalPayment;
import com.example.Low_Level_Design.behevioralPatterns.stretegy.paymentMethods.solution.strategy.UpiPayment;

public class Demo {
    public static void main(String[] args) {
        System.out.println("========== Stretegy pattern =============");
        System.out.println("============ Payment Method =============");

        ShopingCart shopingCart = new ShopingCart();

        shopingCart.setPaymentStretegy(new CreditCardPayment("1234567890"));
        shopingCart.checkout(1000);

        shopingCart.setPaymentStretegy(new PaypalPayment("sddf@email.com"));
        shopingCart.checkout(2000);

        shopingCart.setPaymentStretegy(new UpiPayment("23456799@ybl"));
        shopingCart.checkout(3000);
    }
}
