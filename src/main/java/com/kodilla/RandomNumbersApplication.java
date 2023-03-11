package com.kodilla;

public class RandomNumbersApplication {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();

        randomNumbers.generateNumbers();

        System.out.println("min: " + randomNumbers.min());
        System.out.println("max: " + randomNumbers.max());
    }
}
