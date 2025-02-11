package ex_16_Arrays;

import java.util.Scanner;

public class Lab148_2d_Right_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Stars: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
