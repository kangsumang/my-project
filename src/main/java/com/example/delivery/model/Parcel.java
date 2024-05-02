package com.example.delivery.model;

public class Parcel {
    private double height;
    private double width;
    private double length;

    // Constructor
    public Parcel(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // Getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
