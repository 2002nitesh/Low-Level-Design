package com.example.Low_Level_Design.SolidPrinciple.openClosed.violation;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;

// Responsibility: Managing Database Operations only
public class InvoiceDeoOld {
    Invoice invoice;
    public InvoiceDeoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Save into the DB the invoice
        System.out.println("Saving to database...");
    }
}
