package ex_07_Increment_Decrement_Operator;

public class Lab063_Command_Line_Argument {
    public static void main(String[] args) {
        // Take Inputs
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
//        System.out.println(args[4]); we have not given any values in editor so will give error as "Index out of bond"
    }
}
