package com.kodilla.abstracts.homework;

 TAX-3.5
public class Rectangle extends Shape {

public class Rectangle {
 master
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
