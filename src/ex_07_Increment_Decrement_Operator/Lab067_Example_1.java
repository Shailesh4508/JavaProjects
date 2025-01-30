package ex_07_Increment_Decrement_Operator;

public class Lab067_Example_1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++ a);
        System.out.println(a);

        // A + B
        // A -> a++ -->Exp1(A)--> 10, a --> 11
        //+
        // B -> a -> a -> 11 ->  Exp2 -> 12
        // A + B -> 10 + 12 -> 22
        // A = 12


    }
}
