package com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.solution;

public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker("marker","color", 23,2026), 200);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        invoice.calculateTotal();
        invoiceDao.saveToDB();
        invoicePrinter.printInvoice();
    }
}
