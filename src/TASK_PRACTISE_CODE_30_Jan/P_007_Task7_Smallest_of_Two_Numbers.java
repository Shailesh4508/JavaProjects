package TASK_PRACTISE_CODE_30_Jan;

import java.util.Scanner;

public class P_007_Task7_Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        //Smallest of Two Numbers.//

        // First way using Ternary Operator
//        int a = 10;
//        int b = 9;

        // Second way using Scanner Class//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        // Condition for First and Second way//
        int result = ((a <= b)? a :b);
        System.out.println("The Smallest Number is: "+result);

        // Third way using if else//
//        if (a <= b){
//            System.out.println("The Smallest Number is:" +a);
//        }
//        else {
//            System.out.println("The Smallest Number is:" +b);
//        }
    }
}
