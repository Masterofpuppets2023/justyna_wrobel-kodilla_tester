package com.kodilla.inheritance.homework;

public class macOS extends OperatingSystem{
    public macOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("macOS system were turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("macOS system were turned off");
    }
}
