package TASK_PRACTISE_CODE_25_Jan;

import java.util.Scanner;

public class P_003_Task3_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Words: ");
        String str = sc.next();

        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println("The word is a Palindrome");
        }
        else {
            System.out.println("The word is not a Palindrome");
        }


    }
}




