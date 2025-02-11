package ex_16_Arrays;

import java.util.Arrays;

public class Lab141_Sorting_of_Array {
    public static void main(String[] args) {

        // Second_Largest Number//

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);

        System.out.println(numbers[numbers.length-2]);
    }
}
