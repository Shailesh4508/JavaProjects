package ex_13_Functions;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Lab117_User_defined_in_one_go {

    public static void main(String[] args) {

        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        greet();

        //  2. Without Parameters but With Return Type
        String s = greet_with_hello();
        System.out.println(s);

        int i = age_to_vote();
        System.out.println("Age to vote is --> "+ i);


        //  3. With Parameters and Without Return Type ( 90%)
        great_with_name("Shailesh");
        greet_with_full_name("Shailesh ","Singh");
        greet_with_full_name("GajRaj ","Thakur");
        greet_with_full_name("Lion ","GajRAj");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Salary: ");
        Double salary = sc.nextDouble();
        greet_with_details(name,age,salary);


        //  4. With Parameters and With Return Type

         int sum =sum_of_two_numbers(2,3);
        System.out.println(sum);
        int sum1 =sum_of_two_numbers(2748,3367);
        System.out.println(sum1);

        int sum2 =sum_of_three_numbers(2233,3445,3455);
        System.out.println(sum2);


    }


    // 1. Without Parameters and Without Return Type. (Declare) /Define

    static void greet(){
        System.out.println("Hi, how are you");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello(){
        return ("Hi, how are you: Example 2");
    }

    static  int age_to_vote(){
        System.out.println("Calculating......");
        return (18);
    }


    //  3. With Parameters and Without Return Type (void)
    static void great_with_name(String name){
        System.out.println("Hi, your Name is "+ name);
    }

    static void greet_with_full_name(String firstname, String lastname) {
        System.out.println("Hi, Your name is " + firstname + lastname);
    }

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->"+ name +  "\nYour age is "+age + "\nYour salary is "+ salary);
    }


    //  4. With Parameters and With Return Type

    static int sum_of_two_numbers(int a, int b){
        return (a+b);
    }

    static int sum_of_three_numbers(int a, int b, int c){
        return (a+b+c);
    }
}