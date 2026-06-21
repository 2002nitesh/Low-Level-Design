package com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("printing invoice...");
    }
}
