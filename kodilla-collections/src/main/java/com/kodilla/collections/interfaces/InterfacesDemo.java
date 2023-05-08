package com.kodilla.collections.interfaces;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
