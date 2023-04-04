package com.kodilla.abstracts.homework;
import java.lang.Math;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double surfaceArea() {
        return radius*radius*Math.PI;
    }
    public double circumference() {
        return 2.0*radius*Math.PI;
    }
}
