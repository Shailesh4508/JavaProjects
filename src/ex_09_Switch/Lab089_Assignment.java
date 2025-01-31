package ex_09_Switch;

import java.util.Scanner;

public class Lab089_Assignment {
    public static void main(String[] args) {
        //Please do this assignment program for us
        //CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.

        // Create a Scanner object for reading input

        Scanner sc = new Scanner(System.in);

        //prompt the user for their name
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        //prompt the user for their Age
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        //prompt the user for their Salary
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();

        // Print the collected information
        System.out.println("-------User Information------");
        System.out.println("Name: "+ name);
        System.out.println("Ae: "+ age);
        System.out.println("Salary: "+ salary);

        // Close the scanner
        sc.close();

    }
}
