package com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.violation;

public class ViolationDemo {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("marker", "color", 200, 2026), 24);
        invoice.calculateTotal();
        invoice.saveToDB();
        invoice.printInvoice();
    }
}
