package com.example;

import java.util.Scanner;

class Voter {

    String name;
    int age;
    String citizenship;
    String voterId;
    boolean idValid;

    Voter(String name, int age, String citizenship, String voterId, boolean idValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.idValid = idValid;
    }

    void checkEligibility() {

        System.out.println("\n--------------------------------");
        System.out.println("Voter Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Voter ID: " + voterId);
        System.out.println("ID Valid: " + idValid);

        boolean eligible = true;

        if (age < 18) {
            System.out.println("Not Eligible: Voter is under 18 years old.");
            eligible = false;
        }

        if (!citizenship.equalsIgnoreCase("Indian")) {
            System.out.println("Not Eligible: Voter is not an Indian citizen.");
            eligible = false;
        }

        if (!idValid) {
            System.out.println("Not Eligible: Voter ID is invalid.");
            eligible = false;
        }

        if (eligible) {
            System.out.println("Result: ELIGIBLE TO VOTE");
        }

        System.out.println("--------------------------------");
    }
}

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of voters: ");
        int numberOfVoters = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfVoters; i++) {

            System.out.println("\nEnter details for Voter " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Citizenship: ");
            String citizenship = scanner.nextLine();

            System.out.print("Voter ID: ");
            String voterId = scanner.nextLine();

            System.out.print("Is Voter ID valid? (true/false): ");
            boolean idValid = scanner.nextBoolean();
            scanner.nextLine();

            Voter voter = new Voter(
                    name,
                    age,
                    citizenship,
                    voterId,
                    idValid
            );

            voter.checkEligibility();
        }

        scanner.close();
    }
}
