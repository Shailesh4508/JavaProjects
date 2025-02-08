package TASK_PRACTISE_CODE_19_Jan;

public class P_003_Expression {
    public static void main(String[] args) {
        // Input a = 20;
        // Logic --a + a++ + a--

        // Exp1 : --a --> 20 | 19 | 19
        // Exp2 : a++ --> 19 | 19 | 20
        // Exp3 : --a --> 20 | 20 | 19

        // 19 + 19 + 20 = 58 --> O/P

        int a = 20;
        System.out.println(--a + a++ + a--);
    }
}
