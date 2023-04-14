package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        demonstrateJobs();
    }

    private static void demonstrateJobs() {
        Job doctor = new Doctor(40000, "Leczyc ludzi, wypisywac recepty, brac lapowki");
        Person person = new Person("Milosz", 27, doctor);
        System.out.println(person.getJob().getResponsibilities());
    }

    private static void demonstrateShapes() {
        Circle circle = new Circle(17.);
        Square square = new Square(6.);
        Rectangle rectangle = new Rectangle(19.2, 8.4);
 TAX-3.5
        Shape[] shapes = new Shape[]{circle, square, rectangle};
        Shape[] shapes = { circle, square, rectangle};
 master

        for (int i=0; i<shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape.circumference());
            System.out.println(shape.surfaceArea());
        }
    }
}
