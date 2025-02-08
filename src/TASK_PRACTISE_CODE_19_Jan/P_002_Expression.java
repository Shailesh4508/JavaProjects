package TASK_PRACTISE_CODE_19_Jan;

public class P_002_Expression {
    public static void main(String[] args) {
        // Input a = 10;
        // Logic ++a + a++ + a++

        // Exp1 : ++a --> 10 | 11 | 11
        // Exp2 : a++ --> 10 | 11 | 12
        // Exp3 : a++ --> 10 | 12 | 13

        //  11 + 11 + 12 = 34 - O/P

        int a = 10;
        System.out.println(++a + a++ + a++);
    }
}
