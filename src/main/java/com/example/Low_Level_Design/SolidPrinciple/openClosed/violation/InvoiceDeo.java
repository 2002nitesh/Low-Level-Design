package com.example.Low_Level_Design.SolidPrinciple.openClosed.violation;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;

// Responsibility: Managing Database Operations and File Operations
// BAD: This class violates OCP - needs modification for every new kind of save function
public class InvoiceDeo {
    Invoice invoice;
    public InvoiceDeo(Invoice invoice) {
        this.invoice = invoice;
    }


    public void saveToDB(){
        // save to db
        System.out.println("Saving to database...");
    }

    // BAD: This design violates OCP
    // Every time we add a new save function, we need to modify existing InvoiceDao class
    public void saveToFile(){
        // save to file
        System.out.println("Saving to file...");
    }
}

