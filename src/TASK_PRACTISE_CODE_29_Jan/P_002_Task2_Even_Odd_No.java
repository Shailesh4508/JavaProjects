package TASK_PRACTISE_CODE_29_Jan;

import java.util.Scanner;

public class P_002_Task2_Even_Odd_No {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();

            if (i % 2 == 0) {
                System.out.println("The Number Entered is an Positive Number");
            } else {
                System.out.println("The Number Entered is an Negative Number");
            }
        }
        else{
                System.out.println("Invalid input! Please enter a valid integer");
            }

        sc.close();
    }
}
