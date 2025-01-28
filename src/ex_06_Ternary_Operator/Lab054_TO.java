package ex_06_Ternary_Operator;

public class Lab054_TO {
    public static void main(String[] args) {

        // result = Condition? expression1 : expression2;
        int age = 18;
        String canIVote = age >= 18 ? "Yes you can Vote" : "No you can't Vote";
        System.out.println(canIVote);
    }
}
