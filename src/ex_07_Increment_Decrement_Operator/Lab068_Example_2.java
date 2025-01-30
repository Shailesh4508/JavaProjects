package ex_07_Increment_Decrement_Operator;

public class Lab068_Example_2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // A + B
        // A -> ++a -->Exp1(A)--> 11, a --> 11
        //+
        // B -> a -> a -> 11 ->  Exp2 -> 12
        // A + B -> 11 + 12 -> 23
        // A = 12
    }
}
