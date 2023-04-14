package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean isCorrect = ResultChecker.assertEquals(13, sumResult);
        if (isCorrect) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(b, a);
        isCorrect = ResultChecker.assertEquals(3, subtractResult);
        if (isCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + b + " i " + a);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + b + " i " + a);
        }

        int squarePowerResult = calculator.squarePower(a);
        isCorrect = ResultChecker.assertEquals(25, squarePowerResult);
        if (isCorrect) {
            System.out.println("Metoda squarePower działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda squarePower nie działa poprawnie dla liczby " + a);
        }
    }
}
