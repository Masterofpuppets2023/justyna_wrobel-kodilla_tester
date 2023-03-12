package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] arg) {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        macOS macOS = new macOS(2022);
        macOS.turnOn();
        macOS.turnOff();
        Windows windows = new Windows(2022);
        windows.turnOn();
        windows.turnOff();
    }
}

