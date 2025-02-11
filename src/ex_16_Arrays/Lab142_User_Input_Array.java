package ex_16_Arrays;

import java.util.Scanner;

public class Lab142_User_Input_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        //String[] names = new String[size];
        //float[] names = new float[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the Number: ");
            numbers[i] = sc.nextInt();

        }

        System.out.println("-----------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
