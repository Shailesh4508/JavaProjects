package TASK_PRACTISE_CODE_29_Jan;

import java.util.Scanner;

public class P_003_Task3_Max_of_Two_Numbers {
    public static void main(String[] args) {
        //Find the Maximum of Two Numbers.//

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();

        // With Ternary Operator
//        String result = (a > b)? "First Number" : "Second Number";
//        System.out.println("The Greater is :" +result);

        // With Math.max
        int result = Math.max(a,b);
        System.out.println("Maximum number is: " + result);
        sc.close();
    }
}
