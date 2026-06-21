package com.example.Low_Level_Design.SolidPrinciple.openClosed.violation;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;
import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Marker;

// Usage example - showing problem
public class ViolationDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("marker", "color", 300, 2026), 25);
        invoice.calculateTotal();

        InvoiceDeo invoiceDeo = new InvoiceDeo(invoice);
        invoiceDeo.saveToDB();  // save to DB
        invoiceDeo.saveToFile(); // save to file

        // Problem: If we want to add a new function like saveToMongoDB(),
        // we need to modify InvoiceDao and all its derived classes(if exists)
        // This violates the "closed for modification" part of OCP
    }
}
