package com.example.delivery.model;

public class ParcelCostResponse {
    private double cost;
    private String message;

    // Constructor
    public ParcelCostResponse(double cost, String message) {
        this.cost = cost;
        this.message = message;
    }

    // Getters and setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
