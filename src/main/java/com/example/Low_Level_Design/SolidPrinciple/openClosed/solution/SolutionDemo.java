package com.example.Low_Level_Design.SolidPrinciple.openClosed.solution;

import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Invoice;
import com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution.Marker;

// Usage demonstrate OCP compliance
public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("marker", "color", 2, 2026), 3);
        invoice.calculateTotal();

        DatabaseInvoceDao databaseInvoceDao = new DatabaseInvoceDao(invoice);
        databaseInvoceDao.save(); // save to database

        FileInvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save();  // save to file

        // The system is:
        // - OPEN for extension (new save functions can be added)
        // - CLOSED for modification (existing code remains unchanged)
    }
}
