package com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Saving into DB...");
    }
}
