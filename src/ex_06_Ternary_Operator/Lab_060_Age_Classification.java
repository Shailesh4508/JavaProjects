package ex_06_Ternary_Operator;

public class Lab_060_Age_Classification {
    public static void main(String[] args) {

        //Adult, Minor, Senior
        // Senior > 65
        // Minor < 18
        // Adult >18

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        int Age = 45;
        String Result = (Age < 18)? "Minor" : (Age < 65 )? "Adult" :"Senior";
        System.out.println(Result);

    }
}
