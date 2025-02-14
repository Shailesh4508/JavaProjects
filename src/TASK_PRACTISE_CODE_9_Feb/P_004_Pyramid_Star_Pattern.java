package TASK_PRACTISE_CODE_9_Feb;

import java.util.Scanner;

public class P_004_Pyramid_Star_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Stars: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= num -i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i -1  ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}