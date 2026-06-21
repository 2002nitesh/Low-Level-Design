package com.example.Low_Level_Design.SolidPrinciple.openClosed.solution;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;

// Concrete implementation for DatabaseInvoiceDao
public class DatabaseInvoceDao implements InvoiceDao{
    Invoice invoice;
    public DatabaseInvoceDao(Invoice invoice){
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // save into database
        System.out.println("Saving to database...");
    }
}
