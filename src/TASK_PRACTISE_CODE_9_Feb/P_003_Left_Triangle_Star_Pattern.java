package TASK_PRACTISE_CODE_9_Feb;

import java.util.Scanner;

public class P_003_Left_Triangle_Star_Pattern {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Stars: ");
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

