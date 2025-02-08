package TASK_PRACTISE_CODE_19_Jan;

import java.util.Scanner;

public class P_004_CLI_Option_Name_Age_Sal {
    public static void main(String[] args) {

        // Take a user input - Name, Age and Salary and print them in the end.

        // Creating Scanner class//
        Scanner sc = new Scanner(System.in);

        // Taking User Input //

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Enter your Salary:");
        double salary = sc.nextDouble();

        sc.close();

        System.out.println("Your Name is: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("Your Salary is: " + salary);


    }
}
