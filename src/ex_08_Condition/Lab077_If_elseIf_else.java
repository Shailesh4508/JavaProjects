package ex_08_Condition;

import java.util.Scanner;

public class Lab077_If_elseIf_else {
    public static void main(String[] args) {

        // Number 1 and Number 2
        // Number 1 > Number 2-----> Condition 1
        // Number 1 < Number 2-----> Condition 2
        // Number 1 = Number 2-----> Condition 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int Num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int Num2 = sc.nextInt();

        if (Num1>Num2){
            System.out.println("Number 1st is Greater");
        } else if (Num1<Num2) {
            System.out.println("Number 2nd is Grater");
        }
        else{
            System.out.println("Both are Equal");
        }
    }
}
