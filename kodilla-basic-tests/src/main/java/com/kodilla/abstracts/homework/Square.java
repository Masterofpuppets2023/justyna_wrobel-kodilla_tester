package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;
    public Square(double a) {
        this.a = a;
    }
    public double surfaceArea() {
        return a*a;
    }
    public double circumference() {
        return 4.0*a;
    }
}
