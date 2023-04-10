package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double surfaceArea() {
        return a*b;
    }
    public double circumference() {
        return 2.0*(a + b);
    }
}
