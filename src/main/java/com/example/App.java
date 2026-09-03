package com.example;

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

        System.out.println("----------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Voter ID: " + voterId);
        System.out.println("ID Valid: " + idValid);

        if (age < 18) {
            System.out.println("Result: NOT ELIGIBLE");
            System.out.println("Reason: Underage - must be at least 18 years old.");
        }
        else if (!citizenship.equalsIgnoreCase("Indian")) {
            System.out.println("Result: NOT ELIGIBLE");
            System.out.println("Reason: Not an Indian citizen.");
        }
        else if (!idValid) {
            System.out.println("Result: NOT ELIGIBLE");
            System.out.println("Reason: Voter ID is invalid.");
        }
        else {
            System.out.println("Result: ELIGIBLE TO VOTE");
        }

        System.out.println("----------------------------------------");
    }
}

public class App {

    public static void main(String[] args) {

        // Predefined voter details
        Voter voter1 = new Voter(
                "Rahul Sharma",
                25,
                "Indian",
                "IND12345",
                true
        );

        Voter voter2 = new Voter(
                "Aman Verma",
                16,
                "Indian",
                "IND12346",
                true
        );

        Voter voter3 = new Voter(
                "John Smith",
                30,
                "American",
                "USA12345",
                true
        );

        Voter voter4 = new Voter(
                "Priya Singh",
                22,
                "Indian",
                "IND12348",
                false
        );

        // Check eligibility
        voter1.checkEligibility();
        voter2.checkEligibility();
        voter3.checkEligibility();
        voter4.checkEligibility();
    }
}
