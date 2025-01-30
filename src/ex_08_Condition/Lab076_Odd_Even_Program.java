package ex_08_Condition;

import java.util.Scanner;

public class Lab076_Odd_Even_Program {
    public static void main(String[] args) {

        // Create a program - Take user Input
        // Check whether the input is even or odd

        // Step 1 - Figure out inputs and outputs
        // number (int) -> i/o Scanner class can be taken to give inputs
        // String -> odd or even -> o/p , println
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number!");
        int num = sc.nextInt();

        // Step 2 - Logic Rough
        // num%2 == 0 --> Even
        // num%2 != 0 --> Odd

        // Step 3 : Logic Write
        if(num%2 ==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        sc.close(); // Stop taking input now

        // Edge Cases
        // large int, -ve handle, zero, other inputs - S
    }
}
