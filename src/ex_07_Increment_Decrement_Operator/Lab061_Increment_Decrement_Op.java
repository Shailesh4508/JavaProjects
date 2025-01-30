package ex_07_Increment_Decrement_Operator;

public class Lab061_Increment_Decrement_Op {
    public static void main(String[] args) {

        //pre - increment ->> ++operand
        // value is incremented first and then stored
        int a = 10; // (++a --> a + 1)
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // Result table
        // Line no /a/ Result b
        // line no 8 / 10 / NA
        // Line no 9 / 11 / 11
        // Line no 10 / NA / 11
        // Line no 11 / 11 / NA
    }
}
