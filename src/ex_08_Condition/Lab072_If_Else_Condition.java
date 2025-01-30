package ex_08_Condition;

import java.util.Scanner;

public class Lab072_If_Else_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age !(as an integer)");
        int age = sc.nextInt(); //if rather than integer then will through exception as Input Mismatch

        if (age> 18){
            System.out.println("Allowed to Vote!");
        }
        else{
            System.out.println("Not Allowed to Vote!");
        }
    }
}
