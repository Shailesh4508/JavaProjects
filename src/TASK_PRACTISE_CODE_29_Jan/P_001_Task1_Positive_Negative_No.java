package TASK_PRACTISE_CODE_29_Jan;

import java.util.Scanner;

public class P_001_Task1_Positive_Negative_No {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int i = sc.nextInt();
        String result = (i > 0)? "Positive Number" : "Negative Number";
        System.out.println("Result:" +result);
    }
}
