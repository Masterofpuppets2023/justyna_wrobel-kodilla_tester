package com.kodilla;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("\n*** RANDOM NUMBERS ***\n");
        RandomNumbers randomNumbers = new RandomNumbers();

        randomNumbers.generateNumbers();

        System.out.println("min: " + randomNumbers.min());
        System.out.println("max: " + randomNumbers.max());

        System.out.println("\n*** USERS ***\n");

        User[] users = initUsers();
        double average = calculateAverageAge(users);
        printUsers(users, average);
    }

    private static double calculateAverageAge(User[] users) {
        int sum = 0;

        for (int i = 0; i < users.length; ++i) {
            User currentUser = users[i];
            sum += currentUser.age();
        }

        double average = (double)(sum / users.length);

        return average;
    }

    private static User[] initUsers() {
        User tadzio = new User(1, "Tadzio");
        User krzys = new User(3, "Krzyś");
        User milosz = new User(6, "Miłosz");
        User gabi = new User(13, "Gabrysia");
        User antek = new User(17, "Antoś");

        User[] users = new User[]{tadzio, krzys, milosz, gabi, antek};

        return users;
    }

    private static void printUsers(User[] users, double average) {
        for (int i = 0; i < users.length; ++i) {
            User currentUser = users[i];
            if ((double)currentUser.age() < average) {
                System.out.println(currentUser.name());
            }
        }
    }
}
