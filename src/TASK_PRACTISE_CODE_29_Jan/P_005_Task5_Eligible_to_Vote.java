package TASK_PRACTISE_CODE_29_Jan;

import java.util.Scanner;

public class P_005_Task5_Eligible_to_Vote {
    public static void main(String[] args) {
        //Eligible to Vote (Age Check)//

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Persons Age: ");

        //Conditions//
        if (sc.hasNextInt()) {
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("The Person is Eligible to Vote!");
            } else {
                System.out.println("The Person is Not Eligible to Vote!");
            }
        }
        else {
            System.out.println("Please Enter Integer ony!");
        }
        sc.close();
    }
}
