package TASK_PRACTISE_CODE_19_Jan;

public class P_001_Largest_of_Three_Numbers {
    public static void main(String[] args) {

        //Largest of Three Numbers//
        //Inputs : A = 20, B = 45, C = 9;
        int a = 20;
        int b = 45;
        int c = 9;

        int largest_number = (a >= b)? ((a >= c)? a : c) : ((b >= c)? b : c);
        System.out.println("The Largest Number is : " +largest_number);
    }
}
