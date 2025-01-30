package ex_06_Ternary_Operator;

public class Lab_059_Interview_TO {
    public static void main(String[] args) {
        //         Nested Ternary
//        result = condition1 ? expression1 : expression2;expression - (condition2 ? expression2 : expression3)

        int num = 15;
        String result = (num > 10)? (num > 20? "Greater" : "Between 10 to 20") : "Less than 10";
        System.out.println(result);
    }
}
