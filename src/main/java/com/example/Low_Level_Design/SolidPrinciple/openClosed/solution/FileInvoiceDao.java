package com.example.Low_Level_Design.SolidPrinciple.openClosed.solution;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;

// Concrete implementation for FileInvoiceDao
// NEW File Save Operation: An extension without modification!
public class FileInvoiceDao implements InvoiceDao{
    Invoice invoice;

    public FileInvoiceDao(Invoice invoice){
        // set the invoice
        this.invoice = invoice;
    }

    @Override
    public void save() {
        // save into file
        System.out.println("Saving to file...");
    }
}
