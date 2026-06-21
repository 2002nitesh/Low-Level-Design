package com.example.Low_Level_Design.SolidPrinciple.SingleResponsbilityPrinciple.violation;

public class Invoice {
    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public void calculateTotal(){
        System.out.println("calculating total...");
        this.total = this.quantity * this.marker.price;
        System.out.println("total is " + this.total);
    }

    public void saveToDB(){
        System.out.println("saving to database...");
    }

    public void printInvoice(){
        System.out.println("printing invoice...");
    }
}
