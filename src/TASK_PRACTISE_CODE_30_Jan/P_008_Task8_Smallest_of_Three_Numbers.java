package TASK_PRACTISE_CODE_30_Jan;

import java.util.Scanner;

public class P_008_Task8_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        //Smallest of Three Numbers.//

        // First way using Ternary Operator
        int a = 10;
        int b = 9;
        int c = -21;

        // Second way using Scanner Class//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first Number");
//        int a = sc.nextInt();
//        System.out.println("Enter the Second Number");
//        int b = sc.nextInt();
//        System.out.println("Enter the Third Number");
//        int c = sc.nextInt();

        // Condition for First and Second way//
        int result = (a <= b)? ((a <= c)?  a : c) : ((b <= c)? b : c );
        System.out.println("The Smallest Number is: "+result);

        // Third way using if else//
//        if (a <= b && a <= c){
//            System.out.println("The Smallest Number is:" +a);
//        }
//        else if (b <= a && b <= c) {
//            System.out.println("The Smallest Number is:" +b);
//        }
//        else {
//            System.out.println("The Smallest Number is:" +c);
//        }
    }
}
