package TASK_PRACTISE_CODE_19_Jan;

public class P_005_CLI_Option_Max_of_2_Nos {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        // User Input : Num1---> 67 & Num1---> 21

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int result = ((num1 >= num2)? num1 : num2);
        System.out.println(result);


    }
}
