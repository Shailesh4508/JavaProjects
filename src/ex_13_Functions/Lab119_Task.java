package ex_13_Functions;

import java.util.Scanner;

public class Lab119_Task {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)


        //         // Logic Building

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First_Number :");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else {
            System.out.println("Enter only Integer Value!");
            System.exit(0);
        }
        System.out.println("Enter the Second_Number :");
        int b = sc.nextInt();



        int result_sum = sum(a,b);
        System.out.println(result_sum);
        int result_sub = sub(a,b);
        System.out.println(result_sum);
        int result_div = div(a,b);
        System.out.println(result_div);
        int result_mul = mul(a,b);
        System.out.println(result_mul);
        int result_modulus = modulus(a,b);
        System.out.println(result_modulus);


    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        if (b == 0){
            System.out.println("Div by Zero not allowed!");
        }
        return a / b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int modulus(int a, int b) {
        return a % b;
    }
}
