package com.kodilla;

public class User {

    private String name;
    private int age;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }
}
